(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    CssSelector('ol#table-by-index', false, context, parametersEnrichmentFunctions, parameters, function (table) {
        CssSelector('li', false, table, parametersEnrichmentFunctions, parameters, function (row) {
            RowIndex('rowNo', EagerCssSelector('li', row), row, parametersEnrichmentFunctions, parameters, function (context) {
                ClickCssSelector(".delete-button", "clickDeleteOnRowByNumber", context, parametersEnrichmentFunctions, parameters);
            });
        });
    });

})();