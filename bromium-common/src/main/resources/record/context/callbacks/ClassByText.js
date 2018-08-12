function ClassByText(initialCollectorClass, text, returnParent, context, parametersEnrichmentFunctions, parameters, cb) {
    console.log('Listening for class by text ' + initialCollectorClass);
    context.arrive("." + initialCollectorClass, options, function () {
        var elem = this;
        parametersEnrichmentFunctions.push(function(eventContext) {
            if (context.contains(eventContext)) {
                console.log("Enriching " + elem.innerHTML.trim());
                parameters[text] = elem.innerHTML.trim();
            }
        });
        console.log('The element with class ' + initialCollectorClass + ' arrived with text ' + elem.innerHTML.trim());
        console.log(elem);
        console.log('Class by text ' + initialCollectorClass + ' arrived, passing ' + (returnParent ? context : elem) + ' to callback');
        console.log(returnParent ? context : elem);
        cb(returnParent ? context : elem);
    });
}
