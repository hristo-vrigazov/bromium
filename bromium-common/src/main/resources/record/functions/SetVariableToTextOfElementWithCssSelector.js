function SetVariableToTextOfElementWithCssSelector(variable, selector, eventName) {
    document.arrive(selector, options, function () {
        var parameters = {};
        var text = this.innerText.trim();
        parameters["event"] = eventName;
        parameters["substitution"] = text + '=' + variable;
        bromium.notifyEvent(parameters);
	});

}