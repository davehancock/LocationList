summaryModule.controller('summaryCtrl', ['$scope', '$route', '$filter', '$modal', 'summaryService',
    function ($scope, $route, $filter, $modal, summaryService) {

        $scope.$route = $route;

        $scope.editSummaryItem = function () {

            var modalInstance = $modal.open({
                templateUrl: 'resources/html/summary/modal/summaryModal.html',
                controller: 'summaryModalCtrl'
            });

            modalInstance.result.then(function (selectedItem) {
                $scope.selected = selectedItem;
            }, function () {
               // TODO Edit Summary Values / Refresh Grid
            });
        }

        // Summary items service call and chained promise response
        var updateSummaryItems = function () {
            summaryService.getSummaryItems().then(function (response) {
                $scope.summaryItems = response.data.summaryItemRestList;
            });
        }

        // Currently selected item from ngGrid, Array of a single SummaryItem object
        var selectedSummaryItem = [];

        // Underlying model for summary items
        $scope.summaryItems = updateSummaryItems();

        $scope.gridOptions = {
            data: 'summaryItems',
            selectedItems: selectedSummaryItem,
            multiSelect: false,
            rowHeight: 60,
            rowTemplate: 'resources/html/summary/grid/customRowTemplate.html',
            columnDefs: [
                {field: 'description', displayName: 'Description'},
                {field: 'location', displayName: 'Location'},
                {field: 'timestamp', displayName: 'Timestamp', cellFilter: 'date:\'dd/MM/yyyy hh:mm a\''}
            ]
        };

        $scope.addSummaryItem = function (description) {

            var summaryItem = {description: description, location: "new loc"};

            summaryService.addSummaryItem(summaryItem).then(function (response) {
                var summaryItem = response.data;
                $scope.summaryItems.push(summaryItem);
            });

            // Reset Description Field Value
            $scope.description = null;
        };

        $scope.deleteSummaryItem = function () {

            var summaryItemId = selectedSummaryItem[0].id;

            summaryService.deleteSummaryItem(summaryItemId).then(function (response) {
                angular.forEach($scope.summaryItems, function (key, value) {
                    if (key.id === summaryItemId) {
                        $scope.summaryItems.splice(value, 1);
                    }
                });
            });
        };

    }]);

summaryModule.controller('summaryModalCtrl', ['$scope', '$modalInstance',
    function ($scope, $modalInstance) {

        $scope.ok = function () {
            $modalInstance.close();
        };

        $scope.cancel = function () {
            $modalInstance.dismiss('cancel');
        };

    }]);

