'use strict';

/**
 * @ngdoc function
 * @name bdashwebApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the bdashwebApp
 */
angular.module('bdashwebApp')
  .controller('header', function ( $scope, $location ) {
	  $scope.isActive = function (viewLocation) { 
          return viewLocation === $location.path();
      }; 
      
      $scope.logOut=function(){
    	  alert("test");
      }
  });
