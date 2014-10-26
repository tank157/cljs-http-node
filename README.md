# cljs-http

A ClojureScript HTTP library for node.js.

This is a fork of [cljs-http](https://github.com/r0man/cljs-http) that
unfortunately does not run at all under node.js due to the absence of
XMLHttpRequest.  The only thing that needs to be rewritten is the
core/request function, which I've started rewriting using core.async.

Please refer to the [original project](https://github.com/r0man/cljs-http) for
license and usage information.
