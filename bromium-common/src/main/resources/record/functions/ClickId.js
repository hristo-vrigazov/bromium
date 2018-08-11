function ClickId(elementId, eventName, context) {
    context.arrive('#' + elementId, options, function () {
        this.addEventListener("click", function(e) {
            var parameters = {};
            parameters["event"] = eventName;
            bromium.notifyEvent(parameters);
        });
    });
}
