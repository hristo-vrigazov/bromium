var parameters = {};
var parametersEnrichmentFunctions = [];

CssSelector('.entity-triggers-container', document, function(table) {
    CssSelector('.trigger-list-entry', table, function (row) {
        RowIndex('triggerNo', EagerCssSelector('.trigger-list-entry', table), row, function (selectedElement) {
            ClickCssSelector('.imxt-select-container input.imxt-select', 'another', row);
        })
    })
});
