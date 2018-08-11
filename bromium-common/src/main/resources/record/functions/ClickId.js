function ClickId(elementId, eventName, context, parametersEnrichmentFunctions, parameters) {
    console.log("Listening ClickId");
    context.arrive('#' + elementId, options, function () {
        this.addEventListener("click", function(e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) { enrichmentFunction(); });
            parameters["event"] = eventName;
            bromium.notifyEvent(parameters);
        });
    });
}
