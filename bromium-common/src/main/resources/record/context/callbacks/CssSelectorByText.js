function CssSelectorByText(cssSelector, text, returnParent, context, parametersEnrichmentFunctions, parameters, cb) {
    context.arrive(cssSelector, options, function () {
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
