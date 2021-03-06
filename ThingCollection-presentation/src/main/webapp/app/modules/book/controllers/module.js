define(function (require) {
    var angular = require('angular');
    require('app/modules/book/services/module');
    require('angular-ui-router');

    return angular
            .module('app.book.controllers', ['app.book.services','ui.router'])
            .controller('BookFormController', require('./BookFormController'))
            .controller('BookListController', require('./BookListController'));
});