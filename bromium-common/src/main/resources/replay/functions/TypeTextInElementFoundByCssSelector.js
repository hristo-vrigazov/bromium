function TypeTextInElementFoundByCssSelector(selector, text, hashCode) {
	document.arrive(selector, options, function () {
		bromium.notifySatisfiedCondition(hashCode);
	});
}