listModule.controller("listCtrl", ["$scope", "$route", "$filter", "listService",
    function ($scope, $route, $filter, listService) {

    $scope.$route = $route;

    $scope.listItems = listService.getList();

    $scope.description = null;

    // List operations
    $scope.addListItem = function (description) {

        if(description==null){
            description = "N/A";
        }

        var dateTime = $filter('date')(new Date, "dd/mm/yyyy HH:mm:ss");
        var listItem = {desc: description, location: "new loc", timestamp: dateTime};

        listService.addListItem(listItem);

        // Reset Description
        $scope.description = null;
    };

    $scope.deleteListItem = function () {
        listService.deleteListItem();
    };

}]);
