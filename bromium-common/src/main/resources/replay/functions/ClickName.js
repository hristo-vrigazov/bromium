function ClickName(name, hashcode) {
    document.arrive('[name="' + name + '"]', options, function () {
        bromium.notifySatisfiedCondition(hashcode);
    });
}
