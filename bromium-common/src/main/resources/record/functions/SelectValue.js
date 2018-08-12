function SelectValue(selector, valueAlias, eventName, context, parametersEnrichmentFunctions, parameters) {
    context.arrive(selector, options, function () {
        this.addEventListener("change", function(e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) { enrichmentFunction(context); });
            parameters["event"] = eventName;
            parameters[valueAlias] = this.value;
            bromium.notifyEvent(parameters);
        });
    });
}
