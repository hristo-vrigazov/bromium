window.bromium = {};

window.bromium.conventionConstants = {
    SUBMIT_URL: "http://bromium-submit-event.com/?",
    LINK_INTERCEPTOR_MARKER: "bromium-js-click"
};

window.convertParametersToQueryString = function (data) {
    return Object.keys(data).map(function (key) {
        return [key, data[key]].map(encodeURIComponent).join("=")
    }).join("&");
};

window.bromium.notifyEvent = function (parameters) {
    var queryString = convertParametersToQueryString(parameters);
    var xhr = new XMLHttpRequest();
    xhr.open("GET", bromium.conventionConstants.SUBMIT_URL + queryString);
    xhr.send();
};

window.bromium.shouldInterceptHyperLink = new RegExp(location.host);

var options = {
    fireOnAttributesModification: true,
    existing: true
};

document.arrive('a', options, function () {
    this.addEventListener("click", function (e) {
        if (bromium.shouldInterceptHyperLink.test(this.href)) {
            // console.log('A link that I should intercept was clicked');
            this.href += bromium.conventionConstants.LINK_INTERCEPTOR_MARKER
        }
    });
});

function ClassByText(initialCollectorClass, text, context, cb) {
    context.arrive("." + initialCollectorClass, options, function () {
        var elem = this;
        parametersEnrichmentFunctions.append(function () {
            parameters[text] = elem.innerHTML.trim();
        });
        cb(elem);
    });
}


function CssSelector(selector, context, cb) {
    context.arrive(selector, options, function () {
        cb(this);
    });
}

function RowIndex(indexAlias, rowsProvider, context, cb) {
    //TODO: is this right?
    var elem = context;
    parametersEnrichmentFunctions.append(function () {
        parameters[indexAlias] = Array.prototype.indexOf.call(rowsProvider(), elem);
    });
    cb(elem);
}

function EagerClassByText(initialCollectorClass, elementText, context) {
    return function () {
        var elems = context.getElementsByClassName(initialCollectorClass);
        return Array.prototype.filter.call(elems, function (elem) {
            return elem.innerHTML.trim() === elementText.innerHTML.trim();
        });
    };
}


function EagerCssSelector(selector, context) {
    return function () {
        return context.querySelectorAll(selector);
    };
}

function ClickCssSelector(selector, eventName, context, parametersEnrichmentFunctions, parameters) {
    context.arrive(selector, options, function () {
        this.addEventListener("click", function (e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) {
                enrichmentFunction();
            });
            parameters["event"] = eventName;
            bromium.notifyEvent(parameters);
        });
    });
}

(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector("#ajax-demo", "clickAjaxDemoButton", context, parametersEnrichmentFunctions, parameters);

})();
(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector("#ajax-demo-link", "clickLinkToAjaxDemoPage", context, parametersEnrichmentFunctions, parameters);

})();
(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector("#ajax-button", "clickAjaxCreatedButton", context, parametersEnrichmentFunctions, parameters);

})();
(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector("#destroy-ajax", "clickDestroyAjaxCreatedButton", context, parametersEnrichmentFunctions, parameters);

})();
(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector("#create-dynamic", "clickDynamicButton", context, parametersEnrichmentFunctions, parameters);

})();
(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector("#late-creation", "clickDynamicallyCreatedButton", context, parametersEnrichmentFunctions, parameters);

})();
(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector("#destroy-dynamic", "clickDeleteDynamicallyCreatedButton", context, parametersEnrichmentFunctions, parameters);

})();
(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector("#race-demo", "clickRaceDemoButton", context, parametersEnrichmentFunctions, parameters);

})();


function TypeTextInElementFoundByCssSelector(selector, eventName, text, context, parametersEnrichmentFunctions, parameters) {
    context.arrive(selector, options, function () {
        this.addEventListener("change", function (e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) {
                enrichmentFunction();
            });
            parameters["event"] = eventName;
            parameters[text] = this.value;
            bromium.notifyEvent(parameters);
        });
    });
}

(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    TypeTextInElementFoundByCssSelector("#name-input", "typeTextInNameInput", "username", context, parametersEnrichmentFunctions, parameters);

})();
(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector(".like", "clickLikeButton", context, parametersEnrichmentFunctions, parameters);

})();
(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector("#edit", "clickEditButton", context, parametersEnrichmentFunctions, parameters);

})();
(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector("#upload-button", "clickUploadButton", context, parametersEnrichmentFunctions, parameters);

})();
(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector("#button-to-be-clicked", "clickButtonAfterTextChanged", context, parametersEnrichmentFunctions, parameters);

})();

function ClickClassByText(initialCollectorClass, text, eventName, context, parametersEnrichmentFunctions, parameters) {
    context.arrive("." + initialCollectorClass, options, function () {
        this.addEventListener("click", function (e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) {
                enrichmentFunction();
            });
            parameters["event"] = eventName;
            parameters[text] = this.innerText.trim();
            bromium.notifyEvent(parameters);
        });
    });
}

(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickClassByText("item", "itemName", "clickOnListedItem", context, parametersEnrichmentFunctions, parameters);

})();

function SetVariableToTextOfElementWithCssSelector(variable, selector, eventName, context, parametersEnrichmentFunctions, parameters) {
    context.arrive(selector, options, function () {
        parametersEnrichmentFunctions.forEach(function (enrichmentFunction) {
            enrichmentFunction();
        });
        var text = this.innerText.trim();
        parameters["event"] = eventName;
        parameters["substitution"] = text + '=' + variable;
        bromium.notifyEvent(parameters);
    });

}

(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    SetVariableToTextOfElementWithCssSelector("entityId", ".source-variable", "setEntityIdVariable", context, parametersEnrichmentFunctions, parameters);

})();

function ClickDataId(dataId, eventName, context, parametersEnrichmentFunctions, parameters) {
    context.arrive('input[data-id]', options, function () {
        this.addEventListener("click", function (e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) {
                enrichmentFunction();
            });
            parameters["event"] = eventName;
            var dataIdValue = this.getAttribute("data-id");
            parameters[dataId] = dataIdValue;
            bromium.notifyEvent(parameters);
        });
    });
}

(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickDataId("dataIdValue", "clickSomeIdHere", context, parametersEnrichmentFunctions, parameters);


})();
(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector("#regenerate-button", "clickRegenerateButton", context, parametersEnrichmentFunctions, parameters);

})();
(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickCssSelector("#remove-initial", "clickRemoveInitial", context, parametersEnrichmentFunctions, parameters);

})();

function ClickId(elementId, eventName, context, parametersEnrichmentFunctions, parameters) {
    context.arrive('#' + elementId, options, function () {
        this.addEventListener("click", function (e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) {
                enrichmentFunction();
            });
            parameters["event"] = eventName;
            bromium.notifyEvent(parameters);
        });
    });
}

(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    CssSelector('body', context, function (row) {
        CssSelector('body', table, function (row) {
            ClickId("click-id-test", "clickClickIdTest", context, parametersEnrichmentFunctions, parameters);

        });
    });

})();

function ClickName(name, eventName, context, parametersEnrichmentFunctions, parameters) {
    context.arrive('[name="' + name + '"]', options, function () {
        this.addEventListener("click", function (e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) {
                enrichmentFunction();
            });
            parameters["event"] = eventName;
            bromium.notifyEvent(parameters);
        });
    });
}

(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    ClickName("click-name-test", "clickClickNameTest", context, parametersEnrichmentFunctions, parameters);


})();

function SelectValue(selector, valueAlias, eventName, context, parametersEnrichmentFunctions, parameters) {
    context.arrive(selector, options, function () {
        this.addEventListener("change", function (e) {
            parametersEnrichmentFunctions.forEach(function (enrichmentFunction) {
                enrichmentFunction();
            });
            parameters["event"] = eventName;
            parameters[valueAlias] = this.value;
            bromium.notifyEvent(parameters);
        });
    });
}

(function () {
    var parameters = {};
    var parametersEnrichmentFunctions = [];
    var context = document;
    SelectValue("#select-element", "optionValue", "selectValue", context, parametersEnrichmentFunctions, parameters);

})();