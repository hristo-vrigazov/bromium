function ClickDataId(dataId, hashCode) {
    //TODO: similar logic should be present in other actions as well
    if (dataId.startsWith('{{')) {
        bromium.subscribeForSubstitutionRegistration(dataId, function(substitutionValue) {
            document.arrive('input[data-id="' + substitutionValue + '"]', options, function () {
                bromium.notifySatisfiedCondition(hashCode);
            });
        });
    } else {
        document.arrive('input[data-id="' + dataId + '"]', options, function () {
            bromium.notifySatisfiedCondition(hashCode);
        });
	}
}
