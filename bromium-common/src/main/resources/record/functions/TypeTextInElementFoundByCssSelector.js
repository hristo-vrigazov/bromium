function TypeTextInElementFoundByCssSelector(selector, eventName, text, context, parametersEnrichmentFunctions, parameters) {
	context.arrive(selector, options, function () {
		this.addEventListener("change", function(e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) { enrichmentFunction(context); });
			parameters["event"] = eventName;
			parameters[text] = this.value;
			bromium.notifyEvent(parameters);
		});
	});
}
