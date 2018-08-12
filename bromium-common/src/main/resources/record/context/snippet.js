(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    CssSelector('ol', false, context, parametersEnrichmentFunctions, parameters, function (table) {
        CssSelector('li', false, table, parametersEnrichmentFunctions, parameters, function (row) {
            ClassByText('description', 'rowDescription', true, row, parametersEnrichmentFunctions, parameters, function (context) {
                ClickCssSelector(".delete-button", "clickDeleteOnChosenRowByText", context, parametersEnrichmentFunctions, parameters);
            });
        });
    });

})();