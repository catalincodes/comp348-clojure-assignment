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
		(def file-contents-split (str/split-lines file-contents))
	)
	;let's take the vector-of-data
	(def entries [])
	(def entries (conj entries
		(str/split (get file-contents-split 0) #"\|")
		
		))
	(println (get (get entries 0) 0) )
	;(println vector-of-data)
	;(println (count vector-of-data))
)

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