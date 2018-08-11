function RowIndex(indexAlias, rowsProvider, context, cb) {
    //TODO: is this right?
    var elem = context;
    parametersEnrichmentFunctions.append(function() {
        parameters[indexAlias] = Array.prototype.indexOf.call(rowsProvider(), elem);
    });
    cb(elem);
}