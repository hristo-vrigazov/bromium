function ClickCssSelector(selector, eventName, context) {
	context.arrive(selector, options, function () {
		this.addEventListener("click", function(e) {
			var parameters = {};
			parameters["event"] = eventName;
            console.log('click' + new Date().getTime());
			bromium.notifyEvent(parameters);
		});
	});
}
