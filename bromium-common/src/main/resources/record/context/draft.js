var parameters = {};
var parametersEnrichmentFunctions = [];
var context = document;

CssSelector('.entity-triggers-container', context, function(table) {
    CssSelector('.trigger-list-entry', table, function (row) {
        CssSelector('.selected-row', row, function(row) {
            ClickCssSelector('.imxt-select-container input.imxt-select', 'another', row, parametersEnrichmentFunctions, parameters);
        });
    })
});
