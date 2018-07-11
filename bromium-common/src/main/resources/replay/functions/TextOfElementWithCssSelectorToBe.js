function TextOfElementWithCssSelectorToBe(selector, text, hashcode) {
	document.arrive(selector, options, function () {
		bromium.notifySatisfiedBasedOnText(this, text, hashcode);
	});
}
