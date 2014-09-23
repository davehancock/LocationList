locationListApp = angular.module('locationListApp', ['ngRoute', 'mapModule', 'summaryModule', 'errorModule', 'ngGrid', 'ui.bootstrap']);

locationListApp.config(function ($routeProvider) {

    $routeProvider
        .when('/summary', {
            templateUrl: 'resources/html/summary.html',
            controller: 'summaryCtrl',
            activeTab: 'summaryTab'
        })
        .when('/map', {
            templateUrl: 'resources/html/location.html',
            controller: 'locationCtrl',
            activeTab: 'mapTab'
        })
        .otherwise({
            redirectTo: '/summary'
        });
});

errorModule = angular.module('errorModule', ['ui.bootstrap']);

mapModule = angular.module('mapModule', []);

summaryModule = angular.module('summaryModule', ['ngGrid']);
