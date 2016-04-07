(function() {
    'use strict';

    angular
        .module('adminCarpoolingMcbdApp')
        .controller('DriverDetailController', DriverDetailController);

    DriverDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'entity', 'Driver'];

    function DriverDetailController($scope, $rootScope, $stateParams, entity, Driver) {
        var vm = this;
        vm.driver = entity;
        vm.load = function (id) {
            Driver.get({id: id}, function(result) {
                vm.driver = result;
            });
        };
        var unsubscribe = $rootScope.$on('adminCarpoolingMcbdApp:driverUpdate', function(event, result) {
            vm.driver = result;
        });
        $scope.$on('$destroy', unsubscribe);

    }
})();
