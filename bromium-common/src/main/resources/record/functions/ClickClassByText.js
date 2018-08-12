function ClickClassByText(initialCollectorClass, text, eventName, context, parametersEnrichmentFunctions, parameters) {
	context.arrive("." + initialCollectorClass, options, function () {
		this.addEventListener("click", function(e) {
			parametersEnrichmentFunctions.forEach(function (enrichmentFunction) { enrichmentFunction(context); });
            parameters["event"] = eventName;
            parameters[text] = this.innerText.trim();
            bromium.notifyEvent(parameters);
		});
	});
}
