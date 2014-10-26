# cljs-http

A ClojureScript HTTP library for node.js.

This is a fork of [cljs-http](https://github.com/r0man/cljs-http), which
unfortunately does not run at all under node.js due to the absence of
XMLHttpRequest.  The only thing that needs to be rewritten is the
core/request function, which I've reimplemented using core.async and
node's underlying request module.  Work-in-progress, very rough at present.

Please refer to the [original project](https://github.com/r0man/cljs-http) for
license and usage information.
