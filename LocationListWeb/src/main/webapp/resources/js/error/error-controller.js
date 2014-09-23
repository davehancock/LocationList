errorModule.controller("errorCtrl", ["$scope", "$modal", function ($scope, $modal) {

    $scope.stacktrace = "unknown";

    $scope.$on('errorEvent', function () {

        var modalInstance = $modal.open({
            templateUrl: 'resources/html/errorModal.html',
            controller: ErrorModalInstanceCtrl
        });
    });

}]);

var ErrorModalInstanceCtrl = function ($scope, $modalInstance) {

    $scope.ok = function () {
        $modalInstance.close();
    };

    $scope.cancel = function () {
        $modalInstance.dismiss();
    };
};