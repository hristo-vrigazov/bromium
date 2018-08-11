function ClickCssSelector(selector, eventName, context, parametersEnrichmentFunctions, parameters) {
	context.arrive(selector, options, function () {
		this.addEventListener("click", function(e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) { enrichmentFunction(); });
			parameters["event"] = eventName;
			bromium.notifyEvent(parameters);
		});
	});
}
