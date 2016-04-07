(function() {
    'use strict';

    angular
        .module('adminCarpoolingMcbdApp')
        .config(localStorageConfig);

    localStorageConfig.$inject = ['$localStorageProvider'];

    function localStorageConfig($localStorageProvider) {
        $localStorageProvider.setKeyPrefix('jhi-');
    }
})();
