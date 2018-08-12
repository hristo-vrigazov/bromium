var parameters = {};
var parametersEnrichmentFunctions = [];
var context = document;

CssSelector('.entity-triggers-container', false, context, function(table) {
    CssSelector('.trigger-list-entry', false, table, function (row) {
        CssSelector('.selected-row', true, row, function(row) {
            ClickCssSelector('.imxt-select-container input.imxt-select', 'another', row, parametersEnrichmentFunctions, parameters);
        });
    })
});
