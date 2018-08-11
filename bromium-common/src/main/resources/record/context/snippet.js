(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    CssSelector('ol', context, function (table) {
        CssSelector('li', table, function (row) {
            CssSelector('#chosen', row, function (row) {
                ClickCssSelector(".delete-button", "clickDeleteOnChosenRow", context, parametersEnrichmentFunctions, parameters);
            });
        });
    });

})();