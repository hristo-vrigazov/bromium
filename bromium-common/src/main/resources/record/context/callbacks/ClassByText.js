function ClassByText(initialCollectorClass, text, context, cb) {
    context.arrive("." + initialCollectorClass, options, function () {
        var elem = this;
        parametersEnrichmentFunctions.append(function() {
            parameters[text] = elem.innerHTML.trim();
        });
        cb(elem);
    });
}
