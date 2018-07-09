(defproject cljs-http-node "0.1.19-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.339"]
                 [org.clojure/core.async "0.4.474"]
                 [noencore "0.3.4"]
                 [com.cognitect/transit-cljs "0.8.256"]]

  :plugins [[lein-cljsbuild "1.1.7"]
            [org.bodil/lein-noderepl "0.1.11"]
            [com.cemerick/clojurescript.test "0.3.3"]]

  :cljsbuild {
    :test-commands {"node" ["node" "test-runner.js" "test-js" "test-node.js"]}
    :builds [{:source-paths ["src"]
              :compiler {
                :output-to "cljs-http-node.js"
                :output-dir "js"
                :optimizations :none
                :target :nodejs
                :source-map "cljs-http-node.js.map"}}
             {:id "test-node"
              :source-paths ["src" "test"]
              :compiler {
                :output-to     "test-node.js"
                :target :nodejs ;;; this target required for node, plus a *main* defined in the tests.
                :output-dir    "test-js"
                :optimizations :none
                :pretty-print  true}}]})
