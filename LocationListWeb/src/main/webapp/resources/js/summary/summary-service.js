summaryModule.service('summaryService', ['$rootScope', '$http', '$q', function ($rootScope, $http, $q) {

    this.addSummaryItem = function (summaryItem) {
        summaryItems.push(summaryItem);
    };

    this.deleteSummaryItem = function () {
        summaryItems.splice(0, 1);
    };

    this.getSummaryItems = function () {

        // deferred = $q.defer();
        return $http({method: 'GET', url: 'http://178.62.11.210:8089/summary'}).
            success(function (data) {
                return data;
                // deferred.resolve();
            }).error(function (data, status, headers, config) {
                $rootScope.$broadcast('error:http', status);
            });
        // return deferred.promise;
    };

}]);