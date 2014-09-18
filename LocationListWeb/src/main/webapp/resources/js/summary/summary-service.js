listModule.service('summaryService', function () {

    var listItems = [
        {'desc': 'do something', 'location': 'stoke', 'timestamp': '17:00'},
        {'desc': 'do something more', 'location': 'bham', 'timestamp': '18:00'},
        {'desc': 'do something extra', 'location': 'bmouth', 'timestamp': '12:00'}
    ];

    this.getList = function () {
        return listItems;
    };

    this.addListItem = function (listItem) {
        listItems.push(listItem);
    };

    this.deleteListItem = function () {
        listItems.splice(0, 1);
    };

});