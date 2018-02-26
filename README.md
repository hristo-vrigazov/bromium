# Bromium

[![Join the chat at https://gitter.im/hribol-bromium/Lobby](https://badges.gitter.im/hribol-bromium/Lobby.svg)](https://gitter.im/hribol-bromium/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Build Status](https://travis-ci.org/hristo-vrigazov/bromium.svg?branch=master)](https://travis-ci.org/hristo-vrigazov/bromium)
[![Open Source Love](https://badges.frapsoft.com/os/mit/mit.svg?v=102)](https://github.com/ellerbrock/open-source-badge/)
[![Coverage Status](https://coveralls.io/repos/github/hristo-vrigazov/bromium/badge.svg?branch=master)](https://coveralls.io/github/hristo-vrigazov/bromium?branch=master)

## What is it
Bromium is a framework for running automated integration/end-to-end tests through the browser. It is especially effective
for single page applications (SPA) and any front end that has a lot of dynamic stuff going on.

## When should you use it
* Tests fail sometimes because an action can't be performed due to synchronization issues. 
For example, trying to click on an element that is not there yet.
* You want to create integration tests easily and frequently
* You want to execute the same test across different versions of your app
* You want performance data from your test

## Simple example

TODO: Core project is deployed to Maven, soon others will be too.

## Features
* Declarative way of describing your actions and how they translate to browser actions for different versions of your app. 
For example (this is bromium-dsl, but currently only JSON is supported):

![Example Bromium DSL app](examples/bromium.dsl.png)

This defines an action named `Click on login button` which translates to clicking the element with id `login`. If for example
in another version we cannot locate the element by id, but by class, and leave the other actions unchanged, the configuration would look like this:

![Example Bromium DSL inherit](examples/bromium.dsl.inherit.png)

Now if we execute a test with the step `Click on login button`, it would execute it correctly in any of the two versions.
This makes your end-to-end tests version-independent. 

* You can record integration tests by just performing actions in the browser. Note that the recorded tests are different
from most recorder tools, because they are on the abstract level you have defined - in the example above if you click on
the button with class `login` in the second version, this would be recorded as `Click on login button`, making it possible
to execute the step on other versions of your app out of the box.

* Stable test execution - no more waits, polling, etc. needed. Bromium uses [mutation observers](https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver)
to intelligently know the exact moment of when an action should be performed.

* Get performance data for every run in [HAR](https://en.wikipedia.org/wiki/.har) format and timestamps of the actions. If you are not familiar with HAR, 
it is basically a format for storing HTTP requests/responses with response times, body sizes, etc. 

* Execute tests either on your screen or in headless mode (invisible mode).

* Very flexible architecture based on `Guice` and dependency injection, easily extensible.

## What is the recommended test development process with Bromium
* Define your initial application actions in a file like the one above or in a json file. You can run `bromium init` to 
have a wizard guide you through the process.
* Run `bromium record` with the configuration created, execute the test case yourself. After the run, a json file with your
test case will be outputted.
* Run `bromium replay` with the configuration and the test case from the previous step. This will output an execution report
consisting of performance data, timestamps of actions, result of the test, etc. If want to do this programmatically and 
not from the terminal, you can use the `ReplayBrowser` class and it's method `replay` to get the same data.
* When your test requires a new action or assertion, edit your configuration file and it, or run `bromium update` for a
wizard to guide you through the process.
* When there is a new version of your app, copy your configuration and replace the implementations for the actions or 
run `bromium version` for a wizard to guide you through the process. You can now record on ne version and replay it on
any other version.

## How is it different from
* Selenium

Bromium uses Selenium under the hood, but it adds more features and makes it faster to develop, because we assume that
you are using Selenium for application testing. Selenium does not include any synchronization logic, which makes tests
unstable if one does not write a reliable one of his own.

* Apache JMeter

Bromium uses actual interaction with the browser and records every HTTP request as well as action timestamps 
(perceived speed), making it possible to measure more complicated scenarios that the ones possible with JMeter. JMeter
is better for example for performance testing of REST APIs, while Bromium is more suitable for integration tests and
UI performance tests.

* Selenium IDE and other recording test tools

Selenium IDE records test cases on an HTML level, not on your application level. If I click on an element, it would record
for example that the third div was clicked. Bromium would record that as an action in your application in the way you defined
it, for example `Click the third row`, which would give you an executable test immediately after recording.

## Planned 

* Add more actions
* Deploy to Maven central
* Dockerize test runs, which would make it possible to execute headless test runs even on Windows
* Replace the configuration json with a beautiful DSL which can be used in editor with autocomplete, go to reference etc.
There is a prototype for this and will soon be ready.
* Parallel execution of test runs from one JVM.
* Distributed test runner on multiple machines.
* Maven integration
* Jira plugin
* Basic performance data analyzer and comparator
* Chrome plugin for defining and debugging actions in the browser
* Support browsers other than Chrome

## Contributing
* General questions - [gitter](https://gitter.im/hribol-bromium/Lobby) 
* Bugs, feature requests, etc. - TODO
* Development - instructions, TODO

## How does it work?

It works by putting a proxy between the browser and your server and injecting javascript code to listen for events.
When an event is detected, the javascript sends HTTP request to the proxy and the event in registered in the Java code. 
The whole test case is written to a JSON file. By a given configuration for your application and a given 
test case, you can replay your test using any browser.
