(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    CssSelector('#recursive-table', false, context, parametersEnrichmentFunctions, parameters, function (table) {
        CssSelector('div.row', false, table, parametersEnrichmentFunctions, parameters, function (table) {
            CssSelector('li', false, table, parametersEnrichmentFunctions, parameters, function (row) {
                CssSelectorByText('p.rowName', 'rowName', true, row, parametersEnrichmentFunctions, parameters, function (context) {
                    ClickCssSelector("button", "deleteRowInNamedTable", context, parametersEnrichmentFunctions, parameters);
                });
            });
        }, function (row) {
            ClassByText('tableName', 'tableName', true, row, parametersEnrichmentFunctions, parameters, function (context) {
                ClickCssSelector("button", "deleteRowInNamedTable", context, parametersEnrichmentFunctions, parameters);
            });
        });
    });

})();