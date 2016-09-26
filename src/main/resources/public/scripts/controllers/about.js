'use strict';

/**
 * @ngdoc function
 * @name bdashwebApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the bdashwebApp
 */
angular.module('bdashwebApp')
  .controller('AboutCtrl', function ( $scope, $rootScope, $cookies, $cookieStore, $http, $q) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
    
    $rootScope.authenticated=$cookies.get('authenticated');
    
    
    

  });
