(defproject fregure "0.1.0-SNAPSHOT"
  :description "Experiments in Frege and Clojure integration"
  :url "https://github.com/yurrriq/fregure"
  :license {:name "MIT License"
            :url "http://yurrriq.mit-license.org"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.theoryinpractise.frege/frege "3.22.367-g2737683"]]
  :plugins [[lein-fregec "3.22.367-i"]]

  :source-paths ["src/clojure"]
  :frege-source-paths ["src/frege"]
  
  :main ^:skip-aot fregure.core
  :profiles {:uberjar {:aot :all
                       :prep-tasks ["fregec" "compile"]}})
