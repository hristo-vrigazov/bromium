var parameters = {};
var parametersEnrichmentFunctions = [];

ClassByText('.entity-triggers-container', 'tableName', document, function(table) {
    ClassByText('list-entry', 'displayName', table, function (row) {
        RowIndex('no', EagerClassByText('list-entry', row, table), row, function(selectedElement) {
                ClickCssSelector('.imxt-select-container input.imxt-select', 'another', row);
            });
    })
});
