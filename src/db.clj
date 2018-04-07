(ns db
	(:require [clojure.string :as str]))

(defn other-method-in-db [ ]
	(println "Another method in the db namespace"))

(defn slurp-db-method [x]
	(println "\nPrinting contents of" x)
	(println (slurp x)))

(defn read-file 
	"reads given file"
	[filename]
	(let [file-contents (slurp filename)]
	(println file-contents)))

;(defn read-file
;	[filename]
;	(slurp filename)
;	)

(defn some-method-in-db [x]
	(println x)
	(slurp-db-method "data.txt")
	(other-method-in-db))

(defn hello []
	(println "hello"))