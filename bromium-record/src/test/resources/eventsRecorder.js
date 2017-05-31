window.eventsRecorder = {};
window.eventsRecorder.detection = {};
window.eventsRecorder.convertParametersToQueryString = function(data) {
   return Object.keys(data).map((key) => [key, data[key]].map(encodeURIComponent).join("=")).join("&");
};
window.eventsRecorder.notifyJavaCode = function(parameters) {
    var queryString = eventsRecorder.convertParametersToQueryString(parameters);
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "http://spiderman-submit-event.com/?" + queryString);
    xhr.send();
};

// eventsRecorder is a global object that provides:
// detectionObjects is an array of objects as descibed in DetectableWebDriverAction in Java code
// "e" is the event
// convertParametersToQueryString is a function that converts a map
// to a url query string
window.eventsRecorder.domainSpecificEventHandler = function(e) {
    var detectionObjects = eventsRecorder.detection[e.type];
    for (var i = 0; i < detectionObjects.length; i++) {
        if (detectionObjects[i].isDetected(e)) {
            var parameters = detectionObjects[i].extractParameters(e);
            parameters['event'] = detectionObjects[i].name;
            eventsRecorder.notifyJavaCode(parameters);
        }
    }
};

window.eventsRecorder.detection['click'] = [
    {
        name: 'clickMegaMenu',
        isDetected: function(e) {
            var element = e.srcElement;
            return element.getAttribute('class') && element.getAttribute('class').indexOf('mega-menu-link') !== -1;
        },
        extractParameters: function(e) {
            return {
                text: e.srcElement.innerHTML
            };
        }
    }
];


Object
    .keys(window.eventsRecorder.detection)
    .forEach(eventType => window.addEventListener(eventType, window.eventsRecorder.domainSpecificEventHandler));
