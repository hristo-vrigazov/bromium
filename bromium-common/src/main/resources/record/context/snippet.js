(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    CssSelector('ol', false, context, function (table) {
        CssSelector('li', false, table, function (row) {
            CssSelector('#chosen', true, row, function (context) {
                ClickCssSelector(".delete-button", "clickDeleteOnChosenRow", context, parametersEnrichmentFunctions, parameters);
            });
        });
    });

})();