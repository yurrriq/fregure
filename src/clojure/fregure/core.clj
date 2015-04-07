(ns fregure.core
  (:import Hello)
  (:gen-class))

(defn -main
  "Prints hello from Clojure and Frege"
  [& args]
  (println "Hello from Clojure!")
  (println (Hello/helloWorld)))
