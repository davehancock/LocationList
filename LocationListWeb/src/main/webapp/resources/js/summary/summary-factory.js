summaryModule.factory('Summary', function () {

    return
    $resource('summary/:', {}, {
        query: {method: 'GET', params: {phoneId: 'phones'}, isArray: true

        }
    });
});