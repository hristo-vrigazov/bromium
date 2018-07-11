function ClickCssSelector(selector, hashCode) {
	document.arrive(selector, options, function () {
		bromium.notifySatisfiedCondition(hashCode);
	});
}
