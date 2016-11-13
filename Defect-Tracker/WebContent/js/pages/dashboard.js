defectTracker.factory('DefectListService', function() {
    return {
        defects : $.parseJSON(defectsFromDB) //usersFromDB is set in the jsp <script> tag
    };
});

function defectListController($scope,DefectListService){
	$scope.defects = DefectListService.defects;	


$scope.manageDefect = function(){
	
	$("input[name='defect']").val(JSON.stringify(this.defect));
	$("#selectDefectForm").submit();
};
};
