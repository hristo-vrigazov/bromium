function ClickCssSelector(selector, eventName, context, parametersEnrichmentFunctions, parameters) {
    console.log('Listening for css selector' + selector);
	context.arrive(selector, options, function () {
		this.addEventListener("click", function(e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) { enrichmentFunction(context); });
			parameters["event"] = eventName;
			bromium.notifyEvent(parameters);
		});
	});
}
