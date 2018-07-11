function ElementByCssToBePresent(selector, hashcode) {
	document.arrive(selector, options, function () {
		bromium.notifySatisfiedCondition(hashcode);
	});
}