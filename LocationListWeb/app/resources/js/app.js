locationListApp = angular.module('locationListApp', ['ngRoute', 'mapModule', 'summaryModule', 'errorModule', 'ngGrid', 'ui.bootstrap', 'ngResource', 'google-maps', 'geolocation']);

locationListApp.config(function ($routeProvider) {

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

errorModule = angular.module('errorModule', ['ui.bootstrap']);

mapModule = angular.module('mapModule', ['google-maps', 'geolocation']);

summaryModule = angular.module('summaryModule', ['ngGrid', 'ngResource', 'ui.bootstrap']);
