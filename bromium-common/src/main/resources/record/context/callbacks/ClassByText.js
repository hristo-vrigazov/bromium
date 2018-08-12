function ClassByText(initialCollectorClass, text, returnParent, context, parametersEnrichmentFunctions, parameters, cb) {
    console.log("Listening class by text " + initialCollectorClass + " " + text);
    context.arrive("." + initialCollectorClass, options, function () {
        var elem = this;
        parametersEnrichmentFunctions.push(function(eventContext) {
            if (eventContext === context) {
                console.log("Enriching " + elem.innerHTML.trim());
                parameters[text] = elem.innerHTML.trim();
            }
        });
        cb(returnParent ? context : elem);
    });
}
