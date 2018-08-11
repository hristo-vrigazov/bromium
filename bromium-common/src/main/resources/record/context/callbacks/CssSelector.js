function CssSelector(selector, context, cb) {
    context.arrive(selector, options, function () {
        cb(this);
    });
}