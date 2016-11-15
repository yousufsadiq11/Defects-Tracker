defectTracker.factory('DefectDataService', function() {
    return {
        defect : $.parseJSON(selectedDefect) //usersFromDB is set in the jsp <script> tag
    };
});

function defectDataController($scope,DefectDataService){
	//alert('aaa')
	$scope.defect = DefectDataService.defect;	

/*$scope.manageDefect = function(){
	
	$("input[name='defect']").val(JSON.stringify(this.defect));
	$("#selectDefectForm").submit();
};*/
};
