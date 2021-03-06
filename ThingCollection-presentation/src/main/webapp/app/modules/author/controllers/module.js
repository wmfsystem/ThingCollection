define(function (require) {
    var angular = require('angular');
    require('app/modules/author/services/module');
    require('angular-ui-router');

    return angular
            .module('app.author.controllers', ['app.author.services','ui.router'])
            .controller('ModalAddressController', require('app/modules/author/controllers/ModalAddressController'))
            .controller('ModalContactController', require('app/modules/author/controllers/ModalContactController'))
            .controller('AuthorFormController', require('app/modules/author/controllers/AuthorFormController'))
            .controller('AuthorListController', require('app/modules/author/controllers/AuthorListController'));
});