;; Clojure Studies - Beginner 1045.
;; Vanderlei Junior - 2023/03.

(ns src.1045
  (:require [clojure.string :as str]))

(defn main []
  (let [valores (vec (sort > (mapv #(Float. %) (str/split (read-line) #"\s+"))))
        numero-a (Math/pow (valores 0) 2)
        numero-b (Math/pow (valores 1) 2)
        numero-c (Math/pow (valores 2) 2)]
    (if (>= (valores 0) (+ (valores 1) (valores 2)))
      (println "NAO FORMA TRIANGULO")
      (cond-> ""
        (= numero-a (+ numero-b numero-c)) (str "TRIANGULO RETANGULO\n")
        (> numero-a (+ numero-b numero-c)) (str "TRIANGULO OBTUSANGULO\n")                         
        (< numero-a (+ numero-b numero-c)) (str "TRIANGULO ACUTANGULO\n")
        (= (valores 0) (valores 2)) (str "TRIANGULO EQUILATERO\n")
        (= (count (set valores)) 2) (str "TRIANGULO ISOSCELES\n")
        true (print)))))

(main)