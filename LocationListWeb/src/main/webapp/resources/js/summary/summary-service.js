summaryModule.service('summaryService', ['$rootScope', 'ngResource', function ($rootScope, ngResource) {

    this.addSummaryItem = function (summaryItem) {
        summaryItems.push(summaryItem);
    };

    this.addSummaryItem = function (summaryItem) {
        return $http({method: 'POST', url: 'http://178.62.11.210:8089/summary'}).
            success(function (data) {
                return data;
            }).error(function (data, status, headers, config) {
                $rootScope.$broadcast('error:http', status);
            });
    };

    this.deleteSummaryItem = function () {
        summaryItems.splice(0, 1);
    };

    this.getSummaryItems = function () {

        return $http({method: 'GET', url: 'http://178.62.11.210:8089/summary'}).
            success(function (data) {
                return data;
            }).error(function (data, status, headers, config) {
                $rootScope.$broadcast('error:http', status);
            });
    };

}]);