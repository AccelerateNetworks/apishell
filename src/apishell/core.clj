(ns apishell.core
  (:require [clj-http.client :as client])
  (:require [clojure.java.io :as io] )
  (:gen-class))

(defn parse-args-and-config
  "take in link and content via arguments, modify link and content based on configurations in .apishell"
  [link content]
  ())


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ())
