locationListApp = angular.module('locationListApp', ['ngRoute', 'mapModule', 'listModule']);

locationListApp.config(function ($routeProvider) {

    $routeProvider
        .when('/',
        {
            templateUrl: 'resources/html/home.html',
            controller: 'homeCtrl',
            activeTab: 'homeTab'
        })
        .when('/list', {
            templateUrl: 'resources/html/summary.html',
            controller: 'summaryCtrl',
            activeTab: 'listTab'
        })
        .when('/map', {
            templateUrl: 'resources/html/location.html',
            controller: 'locationCtrl',
            activeTab: 'mapTab'
        })
        .otherwise({
            redirectTo: '/'
        });
});

mapModule = angular.module('mapModule', []);

listModule = angular.module('listModule', []);
