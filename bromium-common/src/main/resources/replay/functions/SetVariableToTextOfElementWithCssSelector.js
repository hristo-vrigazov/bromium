function SetVariableToTextOfElementWithCssSelector(variable, selector, step, hashcode) {
    bromium.onStep(step, function() {
        console.log('Handler for step ' + step + ' was triggered!');
    	document.arrive(selector, substitutionOptions, function () {
            var substitution = this.innerText.trim();
            bromium.registerSubstitution(variable, step, substitution);
    	});
    });

}