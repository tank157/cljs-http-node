try {
    require("source-map-support").install();
} catch(err) {
}
require("./js/goog/bootstrap/nodejs")
require("./cljs-http")
require("./js/cljs_http/core")
cljs_http_node.core._main(); // TODO: fix this assumption
