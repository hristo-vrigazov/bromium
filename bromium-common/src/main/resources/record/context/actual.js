(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    CssSelector('#recursive-table', false, context, parametersEnrichmentFunctions, parameters, function (table) {
        CssSelector('div.table', false, table, parametersEnrichmentFunctions, parameters, function (row) {
            CssSelectorByText('div.tableName', 'tableName', true, row, parametersEnrichmentFunctions, parameters, function (context) {
                CssSelector('li', false, table, parametersEnrichmentFunctions, parameters, function (row) {
                    CssSelectorByText('p.rowName', 'rowName', true, row, parametersEnrichmentFunctions, parameters, function (context) {
                        ClickCssSelector("button", "deleteRowInNamedTable", context, parametersEnrichmentFunctions, parameters);
                    });
                });
            });
        });
    }, function (table) {
        CssSelector('li', false, table, parametersEnrichmentFunctions, parameters, function (row) {
            CssSelectorByText('p.rowName', 'rowName', true, row, parametersEnrichmentFunctions, parameters, function (context) {
                ClickCssSelector("button", "deleteRowInNamedTable", context, parametersEnrichmentFunctions, parameters);
            });
        });
    });

})();