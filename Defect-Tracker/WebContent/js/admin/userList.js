var admin = angular.module('defect-tracker',[]);


admin.factory('UserListService', function() {
    return {
        users : $.parseJSON(usersFromDB) //usersFromDB is set in the jsp <script> tag
    };
});

function userListController($scope,UserListService){
	$scope.users = UserListService.users;	


$scope.manageUser = function(){
	
	$("input[name='user']").val(JSON.stringify(this.user));
	$("#selectUserForm").submit();
};
};
