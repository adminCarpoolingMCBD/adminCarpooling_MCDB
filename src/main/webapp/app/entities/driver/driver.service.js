(function() {
    'use strict';
    angular
        .module('adminCarpoolingMcbdApp')
        .factory('Driver', Driver);

    Driver.$inject = ['$resource'];

    function Driver ($resource) {
        var resourceUrl =  'api/drivers/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    data = angular.fromJson(data);
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    }
})();
