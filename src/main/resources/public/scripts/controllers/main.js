'use strict';

/**
 * @ngdoc function
 * @name bdashwebApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the bdashwebApp
 */
angular.module('bdashwebApp')
  .controller('MainCtrl', function ( $scope, $rootScope, $cookies, $cookieStore, $http, $q) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
    
	 $rootScope.authenticated=$cookies.get('authenticated');

    $scope.pieChartSettings = {
      dataSource: pieChartDataSource,
      series: {
        argumentField: 'category',
        valueField: 'value',
        label: {
          visible: true,
          connector: {
            visible: true
          }
        }
      },
      tooltip: {
        enabled: true,
        percentPrecision: 2,
        customizeText: function (value) {
          return value.percentText;
        }
      },
      title: {
        text: 'Continental Population by 2010 (in millions)'
      },
      legend: {
        horizontalAlignment: 'center',
        verticalAlignment: 'bottom'
      }
    };
	
	$scope.dataGridSettings={
		dataSource: pieChartDataSource,
		columns: ['category', 'value']
	}
	

  });
