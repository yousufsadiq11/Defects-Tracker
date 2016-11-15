defectTracker.factory('DefectListService', function() {
    return {
        defects : $.parseJSON(defectsFromDB) ,
        message: $(message),
        id: $(id),
        lead: $(lead)
        //usersFromDB is set in the jsp <script> tag
    };
});

function DefectListController($scope,DefectListService){
	$scope.defects = DefectListService.defects;	
	$scope.message=DefectListService.message;
	$scope.id=DefectListService.id;
	$scope.lead=DefectListService.lead;
};
