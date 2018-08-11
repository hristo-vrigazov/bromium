var parameters = {};
var parametersEnrichmentFunctions = [];

CssSelector('.entity-triggers-container', document, function(table) {
    CssSelector('.trigger-list-entry', table, function (row) {
        CssSelector('.selected-row', row, function(row) {
            ClickCssSelector('.imxt-select-container input.imxt-select', 'another', row);
        });
    })
});
