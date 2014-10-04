summaryModule.factory('Summary', ['ngResource', function (ngResource) {

    return
    $resource('summary/:', {}, {
        query: {method: 'GET', params: {phoneId: 'phones'}, isArray: true

        }
    });
}]);