'use strict';

/**
 * @ngdoc function
 * @name bdashwebApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the bdashwebApp
 */
angular.module('bdashwebApp')
  .controller('ContactCtrl', function ( $scope,  $rootScope, $cookies, $cookieStore, $http, $q, $location) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];

    
    $rootScope.authenticated=$cookies.get('authenticated');
    
    console.log("test123");
    
    $scope.isActive = function (viewLocation) { 
    	console.log(viewLocation);
        return viewLocation === $location.path();
    };
    
    console.debug($location.path());
    
    console.log("test123");
    
    
    
  });
