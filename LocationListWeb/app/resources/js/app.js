locationListApp = angular.module('locationListApp', ['ngRoute', 'mapModule', 'summaryModule', 'errorModule', 'ngGrid', 'ui.bootstrap', 'ngResource', 'google-maps', 'geolocation']);

locationListApp.config(function ($routeProvider, $locationProvider) {

    $locationProvider.html5Mode(true);

    $routeProvider
        .when('/summary', {
            templateUrl: 'resources/html/summary/summary.html',
            controller: 'summaryCtrl',
            activeTab: 'summaryTab'
        })
        .when('/map', {
            templateUrl: 'resources/html/location/location.html',
            controller: 'locationCtrl',
            activeTab: 'mapTab'
        })
        .otherwise({
            redirectTo: '/summary'
        });
});

locationListApp.controller("navCtrl", ["$scope", "$route", "summaryService", function ($scope, $route, summaryService) {

    $scope.$route = $route;

    $scope.listItems = summaryService.getSummaryItems();

}]);

errorModule = angular.module('errorModule', ['ui.bootstrap']);

mapModule = angular.module('mapModule', ['google-maps', 'geolocation']);

summaryModule = angular.module('summaryModule', ['ngGrid', 'ngResource', 'ui.bootstrap']);
