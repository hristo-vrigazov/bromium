function CssSelector(selector, context, cb) {
    console.log("Listening CssSelector " + selector);
    context.arrive(selector, options, function () {
        cb(this);
    });
}