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
            templateUrl: 'resources/html/list.html',
            controller: 'listCtrl',
            activeTab: 'listTab'
        })
        .when('/map', {
            templateUrl: 'resources/html/map.html',
            controller: 'mapCtrl',
            activeTab: 'mapTab'
        })
        .otherwise({
            redirectTo: '/'
        });
});

mapModule = angular.module('mapModule', []);

listModule = angular.module('listModule', []);
