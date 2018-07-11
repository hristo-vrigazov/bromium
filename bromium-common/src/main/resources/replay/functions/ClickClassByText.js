function ClickClassByText(initialCollectorClass, text, hashCode) {
	document.arrive("." + initialCollectorClass, options, function () {
		bromium.notifySatisfiedBasedOnText(this, text, hashCode);
	});
}