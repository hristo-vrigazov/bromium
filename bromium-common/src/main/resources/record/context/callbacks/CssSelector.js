function CssSelector(selector, returnParent, context, cb) {
    console.log("Listening CssSelector " + selector);
    context.arrive(selector, options, function () {
        cb(returnParent ? context : this);
    });
}