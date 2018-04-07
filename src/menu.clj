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
	;(display-menu)
	(db/read-file "data.txt"))


(-main)
;(db/hello)