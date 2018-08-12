function CssSelector(selector, returnParent, context, parametersEnrichmentFunctions, parameters, cb) {
    context.arrive(selector, options, function () {
        cb(returnParent ? context : this);
    });
}