function ClickDataId(dataId, eventName, context) {
	context.arrive('input[data-id]', options, function () {
		this.addEventListener("click", function(e) {
			var parameters = {};
            parameters["event"] = eventName;
            var dataIdValue = this.getAttribute("data-id");
            parameters[dataId] = dataIdValue;
            bromium.notifyEvent(parameters);
		});
	});
}
