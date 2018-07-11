function ClickClassByText(initialCollectorClass, text, eventName) {
	document.arrive("." + initialCollectorClass, options, function () {
		this.addEventListener("click", function(e) {
			var parameters = {};
            parameters["event"] = eventName;
            parameters[text] = this.innerText.trim();
            bromium.notifyEvent(parameters);
		});
	});
}
