;; Clojure Studies - Beginner 1041.
;; Vanderlei Junior - 2023/03.

(ns src.1041
  (:require [clojure.string :as str]))

(defn main []
  (let [ponto (mapv #(Float. %) (str/split (read-line) #"\s+"))]
    (cond
      (every? zero? ponto) (println "Origem")
      (zero? (ponto 1)) (println "Eixo X")
      (zero? (ponto 0)) (println "Eixo Y")
      (every? pos? ponto) (println "Q1")
      (every? neg? ponto) (println "Q3")
      (and (pos? (ponto 1)) (neg? (ponto 0))) (println "Q2")
      (and (pos? (ponto 0)) (neg? (ponto 1))) (println "Q4"))))

(main)
