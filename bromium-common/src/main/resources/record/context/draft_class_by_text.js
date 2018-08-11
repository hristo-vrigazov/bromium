var parameters = {};
var parametersEnrichmentFunctions = [];

CssSelector('.entity-triggers-container', document, function(table) {
    ClassByText('trigger-list-entry', 'triggerName', table, function (row) {
        RowIndex('triggerNo', EagerClassByText('trigger-list-entry', row, table), row, function(selectedElement) {
            ClickCssSelector('.imxt-select-container input.imxt-select', 'another', row);
        });
    })
});
