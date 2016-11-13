defectTracker.factory('UserDataService', function() {
    return {
        userData : $.parseJSON(selectedUser), 
        listOfModules : $.parseJSON(listOfModules),
        listOfRoles : $.parseJSON(listOfRoles)
    };
});

function userDataController($scope,UserDataService){
	$scope.user = UserDataService.userData;	
	$scope.listOfRoles = UserDataService.listOfRoles;
	$scope.listOfModules = UserDataService.listOfModules;
	
	$scope.getModuleFromName = function(moduleName){
		var selectedModule;
		var list = $scope.listOfModules; 
		for(i=0;i<$scope.listOfModules.length;i++){
			if(JSON.stringify($scope.listOfModules[i].moduleName) === moduleName){
				selectedModule =i;
			}
		}
		return $scope.listOfModules[selectedModule];
	};
	$scope.getRoleFromName = function(roleName){
		var selectedRole;
		for(i=0;i<$scope.listOfRoles.length;i++){
			if(JSON.stringify($scope.listOfRoles[i].roleName) === roleName){
				selectedRole =i;
			}
		}
		return $scope.listOfRoles[selectedRole];
	};
	/*$scope.userModule = $scope.getModuleFromName(JSON.stringify($scope.user.module));
	$scope.userRole = $scope.getRoleFromName(JSON.stringify($scope.user.role));*/
	
	$scope.updateDetails = function(){
		$scope.user.module = $scope.user.module;
		$scope.user.role = $scope.user.role;
		$("input[name='user']").val(JSON.stringify($scope.user));
		$("#userForm").attr("action","UpdateUserController").submit();
	};
}


defectTracker.factory('PasswordDataService', function() {
    return {
        userData : $.parseJSON(selectedUser)
    };
});
function updatePasswordController($scope,PasswordDataService){
	$scope.user = PasswordDataService.userData;	
	//alert(JSON.stringify($scope.user))
	/*var currentPassword = $("#currentPassword").val();
	var newPassword = $("#newPassword").val();
	var confirmPassword = $("#confirmPassword").val();*/
	$scope.updateDetails = function(){
		if($scope.newPassword === $scope.confirmPassword){
			if($scope.user.password === $scope.currentPassword){
				if($scope.newPassword === $scope.currentPassword){
					$("#message").text("Your new password is same as the existing one. Please choose a different password.");
					$('#confirm-dialog').modal('toggle');
				}else{
				$scope.user.password = $scope.newPassword;
				$("input[name='user']").val(JSON.stringify($scope.user));
				//$("input[name='password']").val(JSON.stringify($scope.newPassword));
				$("#userForm").attr("action","UpdatePasswordController").submit();
				}
			}else{
				$("#message").text("Current password is invalid");
				$('#confirm-dialog').modal('toggle');
			}
		}else{
			$("#message").text("New password & Confirm password do not match")
			$('#confirm-dialog').modal('toggle');
		}
	};
	
}
