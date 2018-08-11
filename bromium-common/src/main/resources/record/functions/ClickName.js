function ClickName(name, eventName, context) {
    context.arrive('[name="' + name + '"]', options, function () {
        this.addEventListener("click", function(e) {
            var parameters = {};
            parameters["event"] = eventName;
            bromium.notifyEvent(parameters);
        });
    });
}
