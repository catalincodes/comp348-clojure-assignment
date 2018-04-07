(ns db)

(defn other-method-in-db [ ]
	(println "Another method in the db namespace"))

(defn slurp-db-method [x]
	(println "\nPrinting contents of" x)
	(println (slurp x)))


(defn some-method-in-db [x]
	(println x)
	(slurp-db-method "data.txt")
	(other-method-in-db))

(defn hello []
	(println "hello"))