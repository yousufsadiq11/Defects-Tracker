var dashboard = angular.module('defect-tracker',[]);

dashboard.factory('UserService', function() {
    return {
        user : $.parseJSON(userJson) //usersFromDB is set in the jsp <script> tag
    };
});

function userController($scope,UserService){
	$scope.user = UserService.user;	
};