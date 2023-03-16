;; Clojure Studies - Beginner 1050.
;; Vanderlei Junior - 2023/03.

(ns src.1050)

(def ddd {11 "Sao Paulo" 19 "Campinas"
          21 "Rio de Janeiro" 27 "Vitoria"
          31 "Belo Horizonte" 32 "Juiz de Fora"
          61 "Brasilia" 71 "Salvador"})

(defn main []
  (println (get ddd (Integer. (read-line)) "DDD nao cadastrado")))

(main)