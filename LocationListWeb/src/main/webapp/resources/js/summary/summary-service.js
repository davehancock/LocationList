summaryModule.service('summaryService', function () {

    var summaryItems = [
        {'desc': 'do something', 'location': 'stoke', 'timestamp': '17:00'},
        {'desc': 'do something more', 'location': 'bham', 'timestamp': '18:00'},
        {'desc': 'do something extra', 'location': 'bmouth', 'timestamp': '12:00'}
    ];

    this.getSummary = function () {
        return summaryItems;
    };

    this.addSummaryItem = function (summaryItem) {
        summaryItems.push(summaryItem);
    };

    this.deleteSummaryItem = function () {
        summaryItems.splice(0, 1);
    };

});