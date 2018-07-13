function ClickName(name, eventName) {
    document.arrive('[name="' + name + '"]', options, function () {
        this.addEventListener("click", function(e) {
            var parameters = {};
            parameters["event"] = eventName;
            bromium.notifyEvent(parameters);
        });
    });
}
