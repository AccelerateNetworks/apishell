(ns apishell.core
  (:require [clj-http.client :as client])
  (:require [clojure.java.io :as io] )
  (:gen-class))

(def link (atom ""))
(def content (atom ()))

;;(defn test-args
;;  "ensure that each arg is where it is supposed to be"
;;  [args]
;;  ())

(defn getLink
  "get the link to the api out of the arguments"
  []
  ())

(defn parse-args-and-config
  "take in link and content via arguments, modify link and content based on configurations in .apishell"
  [link content]
  ())

(defn send-to-api
  "take final parsed link and configurations and send content to it"
  [link content]
  ())

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ())
