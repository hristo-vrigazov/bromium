function CssSelector(selector, context, cb) {
    console.log("Listening CssSelector");
    context.arrive(selector, options, function () {
        cb(this);
    });
}