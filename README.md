# Bromium

[![Join the chat at https://gitter.im/hribol-bromium/Lobby](https://badges.gitter.im/hribol-bromium/Lobby.svg)](https://gitter.im/hribol-bromium/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Build Status](https://travis-ci.org/hristo-vrigazov/bromium.svg?branch=master)](https://travis-ci.org/hristo-vrigazov/bromium)
[![Open Source Love](https://badges.frapsoft.com/os/mit/mit.svg?v=102)](https://github.com/ellerbrock/open-source-badge/)
[![Coverage Status](https://coveralls.io/repos/github/hristo-vrigazov/bromium/badge.svg?branch=master)](https://coveralls.io/github/hristo-vrigazov/bromium?branch=master)

A framework on top of selenium which allows you to define a set of actions specific
for your application using selenium webdriver actions, and then records test cases 
using any driver.

The mapping from your application actions to webdriver actions is saved in a JSON file.

It works by putting a proxy between the browser and your server and injecting javascript code
to listen for events. When an event is detected, the javascript sends HTTP request to the proxy
and the event in registered in the Java code. The whole test case is written to a JSON file.

By a given configuration for your application and a given test case, you can replay your test
using any browser.

This is the general picture, more details to follow.