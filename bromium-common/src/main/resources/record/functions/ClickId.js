function ClickId(elementId, eventName) {
    document.arrive('#' + elementId, options, function () {
        this.addEventListener("click", function(e) {
            var parameters = {};
            parameters["event"] = eventName;
            bromium.notifyEvent(parameters);
        });
    });
}
