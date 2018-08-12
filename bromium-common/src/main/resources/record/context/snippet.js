(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    CssSelector('.entity-triggers-container .triggers-wrapper', false, context, parametersEnrichmentFunctions, parameters, function (table) {
        CssSelector('.trigger-details', false, table, parametersEnrichmentFunctions, parameters, function (table) {
            CssSelector('.enumeration-select-columns div label', false, table, parametersEnrichmentFunctions, parameters, function (row) {
                CssSelectorByText('span:not(.styled-checkbox-img)', 'checkboxText', true, row, parametersEnrichmentFunctions, parameters, function (context) {
                    ClickCssSelector("input", "selectCheckboxOptionInTrigger", context, parametersEnrichmentFunctions, parameters);
                });
            });
        }, function (row) {
            ClassByText('trigger-header', 'triggerName', true, row, parametersEnrichmentFunctions, parameters, function (context) {
                ClickCssSelector("input", "selectCheckboxOptionInTrigger", context, parametersEnrichmentFunctions, parameters);
            });
        });
    });

})();