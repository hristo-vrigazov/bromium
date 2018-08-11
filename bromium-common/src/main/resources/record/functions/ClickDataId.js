function ClickDataId(dataId, eventName, context, parametersEnrichmentFunctions, parameters) {
	context.arrive('input[data-id]', options, function () {
		this.addEventListener("click", function(e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) { enrichmentFunction(); });
            parameters["event"] = eventName;
            var dataIdValue = this.getAttribute("data-id");
            parameters[dataId] = dataIdValue;
            bromium.notifyEvent(parameters);
		});
	});
}
