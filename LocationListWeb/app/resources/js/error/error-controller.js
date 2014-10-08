errorModule.controller("errorCtrl", ['$scope', '$modal', function ($scope, $modal) {

    $scope.$on('error:http', function (event, status) {

        var modalInstance = $modal.open({
            templateUrl: 'resources/html/error/errorModal.html',
            controller: ErrorModalInstanceCtrl,
            resolve: {
                statusCode: function() {
                    return status;
                }
            }
        });
    });
}]);

var ErrorModalInstanceCtrl = function ($scope, $modalInstance, statusCode) {

    $scope.stacktrace = statusCode;

    $scope.ok = function () {
        $modalInstance.close();
    };

    $scope.cancel = function () {
        $modalInstance.dismiss();
    };
};