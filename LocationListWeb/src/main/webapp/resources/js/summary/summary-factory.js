listModule.factory('summaryFactory', function () {

    var listItems = [
        {'desc': 'do something', 'location': 'stoke', 'timestamp': '17:00'},
        {'desc': 'do something more', 'location': 'bham', 'timestamp': '18:00'},
        {'desc': 'do something extra', 'location': 'bmouth', 'timestamp': '12:00'}
    ];

    return{
        getList: function () {
            return listItems;
        }
    };

});