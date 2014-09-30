summaryModule.controller('summaryCtrl', ['$scope', '$route', '$filter', 'summaryService',
    function ($scope, $route, $filter, summaryService) {

        $scope.$route = $route;

        // Summary items service call and chained promise response
        var currentSummaryItems = summaryService.getSummaryItems().then(function (response) {
            $scope.summaryItems = response.data.summaryItemList;
        })

        // Scoped handle to refresh items
        $scope.updateSummaryItems = currentSummaryItems;

        // Underlying model for summary items
        $scope.summaryItems = {};

        $scope.gridOptions = {
            data: 'summaryItems',
            columnDefs: [
                {field: 'description', displayName: 'Description'},
                {field: 'location', displayName: 'Location'},
                {field: 'time', displayName: 'Timestamp'}
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
