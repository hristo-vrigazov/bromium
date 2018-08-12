function EagerCssSelectorByText(cssSelector, elementText, context) {
    return function() {
        var elems = context.querySelectorAll(cssSelector);
        return Array.prototype.filter.call(elems, function(elem) {
            return elem.innerHTML.trim() === elementText.innerHTML.trim();
        });
    };
}
