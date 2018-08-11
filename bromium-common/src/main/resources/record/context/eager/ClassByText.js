function EagerClassByText(initialCollectorClass, elementText, context) {
    return function() {
        var elems = context.getElementsByClassName(initialCollectorClass);
        return Array.prototype.filter.call(elems, function(elem) {
            return elem.innerHTML.trim() === elementText.innerHTML.trim();
        });
    };
}
