'use strict';

/**
 * @ngdoc function
 * @name bdashwebApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the bdashwebApp
 */
angular.module('bdashwebApp')
  .controller('DevCtrl', function ( $scope, $rootScope, $cookies, $cookieStore, $http, $q, $stomp, $log, ChatService) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
    
    $rootScope.authenticated=$cookies.get('authenticated');

	/*$scope.dataGridSettings={
		dataSource: customers, 
		columns: ['category', 'value']
	}*/

	/*$scope.messages=[
		{data:"test", content:"test1"},
		{data:"test", content:"test1"},
		{data:"test", content:"test1"}
	];*/
	
	/*$log.debug("call ChatService:"+ChatService);*/
	
	/*$log.debug($scope.messages);*/
	
	$scope.messages=[];
	$scope.dataGridSettings={ 
	    	dataSource: $scope.messages, 
	    	UseEmbeddedNativgator:true,
	    	columns:[{
	    	    dataField:"photo",
	    	    width:200,
	    	    cellTemplate:"cellTemplate"
	    	    },{
	    	    	dataField:"oid",
	    	    	sortOrder:"desc"
	    	    },
	    		'description', 
	    		'instanceEventType', 
	    		'duration', 'gcrecord', 
	    		'guard', 
	    		'logTimestamp', 
	    		'optimisticLockField'
	    		]}
    	ChatService.receive().then(null, null, function(message) {
		$scope.messages.push(message);
		var dataGrid=$("#dxDataGrid").dxDataGrid("instance");
		dataGrid.refresh();
		var tt=$("#dxCircularGauge").dxCircularGauge("instance");
		var tvalue=getRandomInt(50,100);
		console.log(tvalue);
		tt.value(tvalue);
    });
	


	
	
	$scope.gaugeSettings={
	 scale: {
            startValue: 50,
            endValue: 150,
            tick: {
                tickInterval: 10
            }
        },
        rangeContainer: {
            palette: 'pastel',
            ranges: [
                { startValue: 50, endValue: 90 },
                { startValue: 90, endValue: 130 },
                { startValue: 130, endValue: 150 },
            ]
        },
        title: {
            text: 'Instance Event',
            font: { size: 28 }
        },
        value: 105
    };

    function getRandomInt(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
	}


	
	
	/*$("#dxDataGrid").dxDataGrid("instance").option('dataSource').load();*/
	
	/*$scope.dataGridSettings={
		dataSource: customers, 
		columns: ['category', 'value']
		dataSource:  new DevExpress.data.DataSource({ 
            load: function () {
                var def = $.Deferred();
                $http({ method: 'GET', url: 'http://localhost:8080/people' }).success(function (data) {
                    def.resolve(data);
                });
                return def.promise();
            }
        }) 
	}*/
	
	
/*	function connect() {
            var socket = new SockJS('http://localhost:8080/hello');
			var stompClient = null;
            stompClient = Stomp.over(socket);  
			console.log(stompClient);
            stompClient.connect({}, function(frame) {
                console.log('Connected: ' + frame);
				stompClient.send("/app/hello", {}, JSON.stringify({ 'name': 'name' }));
                stompClient.subscribe('/topic/greetings', function(greeting){
                    //alert(JSON.parse(greeting.body).content);
					$log.debug(JSON.parse(greeting.body).content);
					return JSON.parse(greeting.body).content;
                });
            });
        }
	connect(); */
	









	
  });
