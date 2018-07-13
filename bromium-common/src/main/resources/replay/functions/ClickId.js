function ClickId(elementId, hashcode) {
    document.arrive('#' + elementId, options, function () {
        bromium.notifySatisfiedCondition(hashcode);
    });
}
