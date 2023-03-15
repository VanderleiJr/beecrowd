;; Clojure Studies - Beginner 1044.
;; Vanderlei Junior - 2023/03.

(ns src.1044
  (:require [clojure.string :as str]))

(defn main []
  (let [valores (mapv #(Integer. %) (str/split (read-line) #"\s+"))]
    (if (or (zero? (rem (valores 1) (valores 0)))
            (zero? (rem (valores 0) (valores 1))))
      (println "Sao Multiplos")
      (println "Nao sao Multiplos"))))

(main)