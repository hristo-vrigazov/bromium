function SelectValue(selector, valueAlias, eventName, context) {
    context.arrive(selector, options, function () {
        this.addEventListener("change", function(e) {
            var parameters = {};
            parameters["event"] = eventName;
            parameters[valueAlias] = this.value;
            bromium.notifyEvent(parameters);
        });
    });
}