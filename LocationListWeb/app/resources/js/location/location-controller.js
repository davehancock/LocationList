mapModule.controller("locationCtrl", ['$scope', '$route', 'geolocation', function ($scope, $route, geolocation) {

    $scope.$route = $route;

    //50.738481099999994
    //-1.8844310999999998

    //45
    //-73

    $scope.lat = 50.738481099999994;
    $scope.long = -1.8844310999999998;

    $scope.map = {
        center: {
            latitude: $scope.lat,
            longitude: $scope.long
        },
        zoom: 9
    };

    $scope.updateLocation = function () {
        geolocation.getLocation().then(function (data) {
            $scope.lat = data.coords.latitude;
            $scope.long = data.coords.longitude;
        })
    };

//    $scope.$watch('lat', $scope.updateLocation);
//    $scope.$watch('long', $scope.updateLocation);

}]);
