listModule.controller("summaryCtrl", ["$scope", "$route", "$filter", "summaryService",
    function ($scope, $route, $filter, summaryService) {

        $scope.$route = $route;

        $scope.summaryItems = summaryService.getList();

        $scope.addListItem = function (description) {

            if (description == null) {
                description = "N/A";
            }

            var dateTime = $filter('date')(new Date, "dd/MM/yyyy HH:mm:ss");
            var listItem = {desc: description, location: "new loc", timestamp: dateTime};

            summaryService.addListItem(listItem);

            // Reset Description
            $scope.description = null;
        };

        $scope.deleteListItem = function () {
            summaryService.deleteListItem();
        };

    }]);
