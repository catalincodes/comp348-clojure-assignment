(ns menu
	(:require [db :as db]))

(defn other-method-in-menu [x]
	(println x))

(defn display-menu []
	(println "+-----------------+")
	(println "|Menu options     |")
	(println "| 1. some option  |")
	(println "| 2. other option |"))

(defn -main [ ]
	(println "Entering main program")
	(display-menu)
	(other-method-in-menu "This is a method in menu")
	(db/some-method-in-db "this method is in db namespace"))


(db/some-method-in-db "test")