function ClickId(elementId, eventName, context, parametersEnrichmentFunctions, parameters) {
    context.arrive('#' + elementId, options, function () {
        this.addEventListener("click", function(e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) { enrichmentFunction(context); });
            parameters["event"] = eventName;
            bromium.notifyEvent(parameters);
        });
    });
}
