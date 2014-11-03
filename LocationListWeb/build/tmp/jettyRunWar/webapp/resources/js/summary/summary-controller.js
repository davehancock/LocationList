summaryModule.controller('summaryCtrl', ['$scope', '$route', '$filter', '$modal', 'summaryService',
    function ($scope, $route, $filter, $modal, summaryService) {

        $scope.$route = $route;

        // Summary items service call and chained promise response
        var updateSummaryItems = function () {
            summaryService.getSummaryItems().then(function (response) {
                $scope.summaryItems = response.data.summaryItemRestList;
            });
        }

        // Underlying model for summary items
        $scope.summaryItems = updateSummaryItems();

        // Item that was last selected within the summary grid
        var currentlySelectedItem = [];

        // Ng-grid configuration
        $scope.gridOptions = {
            data: 'summaryItems',
            multiSelect: false,
            rowHeight: 50,
            selectedItems: currentlySelectedItem,
            rowTemplate: 'resources/html/summary/grid/summaryRowTemplate.html',
            columnDefs: [
                {field: 'description', displayName: 'Description'},
                {field: 'location', displayName: 'Location'},
                {field: 'timestamp', displayName: 'Timestamp', cellFilter: 'date:\'dd/MM/yyyy hh:mm a\''}
            ]
        };

        /**
         *
         * @param description
         */
        $scope.addSummaryItem = function (description) {

            var summaryItem = {description: description, location: "new loc"};

            summaryService.addSummaryItem(summaryItem).then(function (response) {
                var summaryItem = response.data;
                $scope.summaryItems.push(summaryItem);
            });

            // Reset Description Field Value
            $scope.description = null;
        };

        /**
         *
         * @param summaryItem
         */
        $scope.deleteSummaryItem = function () {

            var summaryItemId = currentlySelectedItem[0].id;

            summaryService.deleteSummaryItem(summaryItemId).then(function (response) {
                angular.forEach($scope.summaryItems, function (key, value) {
                    if (key.id === summaryItemId) {
                        $scope.summaryItems.splice(value, 1);
                    }
                });
            });
        };

        /**
         *
         * @param summaryItem
         */
        $scope.editSummaryItem = function () {

            var selectedItem = currentlySelectedItem[0];

            var modalInstance = $modal.open({
                templateUrl: 'resources/html/summary/modal/summaryModal.html',
                controller: 'summaryModalCtrl',
                resolve: {
                    listItem: function () {
                        return selectedItem;
                    }
                }
            });

            modalInstance.result.then(function (listItem) {
                editSummaryItem(listItem);

            }, function () {
                // TODO NO-OP
            });
        }

        /**
         *
         * @param listItem
         */
        var editSummaryItem = function (listItem) {

            // Make a call to the summary service to edit an item.
            summaryService.editSummaryItem(listItem).then(function (response) {

                var summaryItem = response.data;

                // Find and replace original item in summaryItems list with selectedItem
                angular.forEach($scope.summaryItems, function (value, index) {
                    if (value.id === summaryItem.id) {
                        $scope.summaryItems[index] = summaryItem;
                    }
                });
            });
        }
    }]);

summaryModule.controller('summaryModalCtrl', ['$scope', '$modalInstance', 'listItem',
    function ($scope, $modalInstance, listItem) {

        $scope.listItem = listItem;

        $scope.ok = function () {
            $modalInstance.close($scope.listItem);
        };

        $scope.cancel = function () {
            $modalInstance.dismiss('cancel');
        };

    }]);

