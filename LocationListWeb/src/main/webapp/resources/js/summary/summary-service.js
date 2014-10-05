summaryModule.service('summaryService', ['$rootScope', '$http', '$location', function ($rootScope, $http, $location) {

    const PORT = '8089';

    const HOST = $location.host();

    const URL = 'http://' + HOST + ':' + PORT + '/summary/';

    this.editSummaryItem = function (summaryItem) {
        return $http({method: 'PUT', url: URL + summaryItem.id, data: summaryItem}).
            success(function (data) {
                return data;
            }).error(function (data, status, headers, config) {
                $rootScope.$broadcast('error:http', status);
            });
    };

    this.addSummaryItem = function (summaryItem) {
        return $http({method: 'POST', url: URL, data: summaryItem}).
            success(function (data) {
                return data;
            }).error(function (data, status, headers, config) {
                $rootScope.$broadcast('error:http', status);
            });
    };

    this.deleteSummaryItem = function (summaryItemId) {
        return $http({method: 'DELETE', url: URL + summaryItemId}).
            success(function (data) {
                return data;
            }).error(function (data, status, headers, config) {
                $rootScope.$broadcast('error:http', status);
            });
    };

    this.getSummaryItems = function () {
        return $http({method: 'GET', url: URL}).
            success(function (data) {
                return data;
            }).error(function (data, status, headers, config) {
                $rootScope.$broadcast('error:http', status);
            });
    };

}]);