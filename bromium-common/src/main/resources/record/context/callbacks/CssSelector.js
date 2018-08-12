function CssSelector(selector, returnParent, context, parametersEnrichmentFunctions, parameters, cb) {
    console.log('Listening for css selector ' + selector);
    context.arrive(selector, options, function () {
        console.log('Selector ' + selector + ' arrived, passing ' + (returnParent ? context : this) + ' to callback');
        console.log((returnParent ? context : this));
        cb(returnParent ? context : this);
    });
}