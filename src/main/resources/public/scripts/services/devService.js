angular.module("bdashwebApp").service("ChatService", function($q, $timeout, $log) {
    
    var service = {}, listener = $q.defer(), socket = {
      client: null,
      stomp: null
    }, messageIds = [];
    
    service.RECONNECT_TIMEOUT = 30000;
    /*service.SOCKET_URL = "http://localhost:8080/hello";*/
    service.CHAT_TOPIC = "/topic/greetings";
    service.CHAT_BROKER = "/app/hello";
    
	
	
	
    service.receive = function() {
      return listener.promise;
    };
    
    service.send = function(message) {
      var id = Math.floor(Math.random() * 1000000);
      socket.stomp.send(service.CHAT_BROKER, {
        priority: 9
      }, JSON.stringify({
        message: message,
        id: id
      }));
      messageIds.push(id);
    };
    
    var reconnect = function() {
      $timeout(function() {
        initialize();
      }, this.RECONNECT_TIMEOUT);
    };
    
    var getMessage = function(data) {
		/*console.log("##getMessage##");
		console.log(data.toString());
		console.log("##getMessage##");*/
      var message = JSON.parse(data), out = {};
    out.photo = message.photo;
	  out.duration = message.duration;
	  out.description = message.description;
	  out.gcrecord = message.gcrecord;
	  out.guard = message.guard;
	  out.location = message.location;
	  out.instanceEventType = message.instanceEventType;
	  out.logTimestamp = new Date(message.logTimestamp);
	  out.oid = message.oid;
	  out.optimisticLockField = message.optimisticLockField;
	  $log.debug(message.optimisticLockFiedld);
      var d=new Date(out.logTimestamp);
      /*if (_.contains(messageIds, message.content   )) {
        out.self = true;
        messageIds = _.remove(messageIds, message.id);
      }*/
      return out;
    };
    
    var startListener = function() {
      socket.stomp.subscribe(service.CHAT_TOPIC, function(data) {
        listener.notify(getMessage(data.body));
		console.log("##startListener##");
		console.log(data.body);
		console.log("##endListener##");
      });
    };
    
    var initialize = function() {
      socket.client = new SockJS( '/hello');
      socket.stomp = Stomp.over(socket.client);
      socket.stomp.connect({}, startListener);
      socket.stomp.onclose = reconnect;
    };
    
    initialize();
    return service;
  });