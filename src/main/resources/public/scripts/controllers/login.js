'use strict';

/**
 * @ngdoc function
 * @name bdashwebApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the bdashwebApp
 */
angular.module('bdashwebApp')
.controller('LoginCtrl', function ( $scope,  $rootScope, $cookieStore, $http, $q, $location, FlashService ) {
	
$scope.tlogin=function(){
	var headers =$scope.vm? {authorization : "Basic "
      + btoa($scope.vm.username + ":" + $scope.vm.password)
  } : {};
  $scope.vm.dataLoading=true; 
  
  $http.get('user', {headers:headers}).success(function(response, data,status,headers,config){
	  $rootScope.authenticated = true;
	  $cookieStore.put('authenticated',$rootScope.authenticated);
	  $location.path("/dev");  
  }).error(function(response, data, status, headers, config){
	  $scope.vm.dataLoading=false; 
	  $scope.vm.username=null;
	  $scope.vm.password=null;
      $rootScope.flash = {
              message: "Username or password is incorrect, please try again",
              type: 'error'               
          };	
  });
}
  
});
