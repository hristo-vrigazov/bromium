function TypeTextInElementFoundByCssSelector(selector, eventName, text, context) {
	context.arrive(selector, options, function () {
		this.addEventListener("change", function(e) {
			var parameters = {};
				parameters["event"] = eventName;
				parameters[text] = this.value;
				bromium.notifyEvent(parameters);
		});
	});
}
