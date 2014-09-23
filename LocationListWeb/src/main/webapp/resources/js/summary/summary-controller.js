summaryModule.controller('summaryCtrl', ['$scope', '$route', '$filter', 'summaryService',
    function ($scope, $route, $filter, summaryService) {

        $scope.$route = $route;

        $scope.summaryItems = summaryService.getSummary();

        $scope.gridOptions = {
            data: 'summaryItems',
            columnDefs: [
                {field: 'desc', displayName: 'Description'},
                {field: 'location', displayName: 'Location'},
                {field: 'timestamp', displayName: 'Timestamp'}
            ]
        };

        $scope.addSummaryItem = function (description) {

            if (description == null) {
                description = "N/A";
            }

            var dateTime = $filter('date')(new Date, "dd/MM/yyyy HH:mm:ss");
            var summaryItem = {desc: description, location: "new loc", timestamp: dateTime};

            summaryService.addSummaryItem(summaryItem);

            // Reset Description
            $scope.description = null;
        };

        $scope.deleteSummaryItem = function () {
            summaryService.deleteSummaryItem();
        };

    }]);
