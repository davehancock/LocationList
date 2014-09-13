listModule.controller("listCtrl", ["$scope", "$route", "listService", function ($scope, $route, listService) {

    // Route
    $scope.$route = $route;

    // List Service on init
    var listService = listService;
    $scope.listItems = listService.getList();

    // List operations
    $scope.addListItem = function () {
        var listItem = {desc: "new", location: "new loc", timestamp: "11:00"}
        listService.addListItem(listItem);
    }

    $scope.deleteListItem = function () {
        listService.deleteListItem();
    }

}]);
