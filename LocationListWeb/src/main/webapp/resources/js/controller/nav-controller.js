locationListApp.controller("navCtrl", ["$scope", "$route", "listService", function ($scope, $route, listService) {

    $scope.$route = $route;

    var listService = listService;

    $scope.listItems = listService.getList();

}]);