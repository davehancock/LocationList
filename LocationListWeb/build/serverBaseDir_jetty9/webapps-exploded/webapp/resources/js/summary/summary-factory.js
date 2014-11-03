summaryModule.factory('Summary', ['$resource', function ($resource) {

    return
    $resource('summary/:', {}, {
        query: {method: 'GET', params: {phoneId: 'phones'}, isArray: true

        }
    });
}]);