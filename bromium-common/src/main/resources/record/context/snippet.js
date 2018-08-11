(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    CssSelector(':root', context, function (table) {
        CssSelector('body', table, function (row) {
            CssSelector('#click-id-test', row, function (row) {
                ClickId("click-id-test", "clickClickIdTest", context, parametersEnrichmentFunctions, parameters);

            });
        });
    });

})();