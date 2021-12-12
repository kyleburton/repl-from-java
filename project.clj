(defproject com.github.kyleburton/repl-from-java "1.0.2"
  :description "CIDER + Nepl in a single dependency."
  :url "https://github.com/kyleburton/repl-from-java"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths      ["src/clojure"]
  :java-source-paths ["src/java"]
  :main ^:skip-aot com.github.kyleburton.Repl
  :dependencies [[org.clojure/clojure                    "1.10.1"]
                 [org.clojure/tools.logging              "1.2.1"]
                 [org.clojure/tools.nrepl                "0.2.13"]
                 [cider/cider-nrepl                      "0.21.1"]
                 [ch.qos.logback/logback-classic         "1.2.3"]])
