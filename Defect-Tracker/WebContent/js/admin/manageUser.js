var admin = angular.module('defect-tracker',[]);
admin.factory('UserDataService', function() {
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
	$scope.userModule = $scope.getModuleFromName(JSON.stringify($scope.user.module));
	$scope.userRole = $scope.getRoleFromName(JSON.stringify($scope.user.role));
	
	$scope.updateDetails = function(){
		$scope.user.module = $scope.userModule.moduleName;
		$scope.user.role = $scope.userRole.roleName;
		$("input[name='user']").val(JSON.stringify($scope.user));
		$("#userForm").attr("action","UpdateUserController").submit();
	};
	
	$scope.confirmDelete = function(){
		$('#confirm-dialog').modal('toggle');
	}
	$scope.removeUser = function(){
		$("input[name='user']").val(JSON.stringify($scope.user));
		$("#userForm").attr("action","DeleteUserController").submit();
		
	};
}
