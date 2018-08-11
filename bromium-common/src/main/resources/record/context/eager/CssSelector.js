function EagerCssSelector(selector, context) {
    return function() {
        return context.querySelectorAll(selector);
    };
}