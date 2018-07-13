function ClickId(elementId, eventName) {
    console.log('Listener invoked');

    document.arrive('#' + elementId, options, function () {
        console.log('Element arrived');
        this.addEventListener("click", function(e) {
            var parameters = {};
            parameters["event"] = eventName;
            bromium.notifyEvent(parameters);
        });
    });
}
