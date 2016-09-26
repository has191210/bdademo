'use strict';

/**
 * @ngdoc overview
 * @name bdashwebApp
 * @description
 * # bdashwebApp
 *
 * Main module of the application.
 */
angular
  .module('bdashwebApp', [
    'ngAnimate',
    'ngCookies',
    'ngMessages',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'dx',
    'openlayers-directive',
	'ngStomp',
	'angular-websocket'
	])
  .config(function ($routeProvider, $httpProvider) {
    $routeProvider
      .when ('/', {
        templateUrl:'views/login.html',
        controller:'LoginCtrl',
        controllerAs:'login'
      })
      .when('/main', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/contact', {
        templateUrl: 'views/contact.html',
        controller: 'ContactCtrl',
        controllerAs: 'contact'
      })
      .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl',
        controllerAs: 'about'
      })
      .when('/dev', {
        templateUrl: 'views/dev.html',
        controller: 'DevCtrl',
        controllerAs: 'dev'
      })
      .otherwise({
        redirectTo: '/'
      });
    $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
  });
