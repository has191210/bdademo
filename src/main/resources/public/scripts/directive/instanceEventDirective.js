angular.module('bdashwebApp').directive("instanceEventDirective", function( $timeout){

return {
	restrict:'AE',
	link:function(scope, element, attrs){
		/*var constantNum=cubism.context().serverDelay(new Date(2012, 4, 2) ).step(864e5).size(1280);*/

var context = cubism.context()
    .serverDelay(0)
    .clientDelay(0)
    .step(1e3)
    .size(960);

var foo = random("foo"),
    bar = random("bar");

d3.select("#example1").call(function(div) {

  div.append("div")
      .attr("class", "axis")
      .call(context.axis().orient("top"));

  div.selectAll(".horizon")
      .data([foo, bar, foo.add(bar), foo.subtract(bar)])
      .enter().append("div")
      .attr("class", "horizon")
      .call(context.horizon().extent([-20, 20]));

  div.append("div")
      .attr("class", "rule")
      .call(context.rule());

});

function random(name) {
  var value = 0,
      values = [],
      i = 0,
      last;
  return context.metric(function(start, stop, step, callback) {
    start = +start, stop = +stop;
    if (isNaN(last)) last = start;
    while (last < stop) {
      last += step;
      value = Math.max(-10, Math.min(10, value + .8 * Math.random() - .4 + .2 * Math.cos(i += .2)));
      values.push(value);
    }
    callback(null, values = values.slice((start - stop) / step));
  }, name);
}


	}

}

});

