(function () {
    'use strict';

    angular
        .module('adminCarpoolingMcbdApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();
