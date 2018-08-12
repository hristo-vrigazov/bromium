function CssSelectorByText(cssSelector, text, returnParent, context, parametersEnrichmentFunctions, parameters, cb) {
    console.log('Listening for css selector by text ' + cssSelector);
    context.arrive(cssSelector, options, function () {
        var elem = this;
        parametersEnrichmentFunctions.push(function(eventContext) {
            if (context.contains(eventContext)) {
                console.log("Enriching " + elem.innerHTML.trim());
                parameters[text] = elem.innerHTML.trim();
            }
        });
        console.log('The element with css selector ' + cssSelector + ' arrived with text ' + elem.innerHTML.trim());
        console.log(elem);
        console.log('Selector by text ' + cssSelector + ' arrived, passing ' + (returnParent ? context : elem) + ' to callback');
        console.log(returnParent ? context : elem);
        cb(returnParent ? context : elem);
    });
}
