function SetVariableToTextOfElementWithCssSelector(variable, selector, eventName, context, parametersEnrichmentFunctions, parameters) {
    context.arrive(selector, options, function () {
        parametersEnrichmentFunctions.forEach(function (enrichmentFunction) { enrichmentFunction(); });
        var text = this.innerText.trim();
        parameters["event"] = eventName;
        parameters["substitution"] = text + '=' + variable;
        bromium.notifyEvent(parameters);
	});

}