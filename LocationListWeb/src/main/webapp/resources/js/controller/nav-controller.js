locationListApp.controller("navCtrl", ["$scope", "$route", "summaryService", function ($scope, $route, summaryService) {

    $scope.$route = $route;

    $scope.listItems = summaryService.getSummary();

}]);