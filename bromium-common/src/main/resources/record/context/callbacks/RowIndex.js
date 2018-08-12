function RowIndex(indexAlias, rowsProvider, context, parametersEnrichmentFunctions, parameters, cb) {
    //TODO: is this right?
    var elem = context;
    parametersEnrichmentFunctions.push(function(eventContext) {
        if (eventContext === context) {
            parameters[indexAlias] = Array.prototype.indexOf.call(rowsProvider(), elem);
        }
    });
    cb(elem);
}