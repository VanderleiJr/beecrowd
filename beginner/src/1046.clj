;; Clojure Studies - Beginner 1046.
;; Vanderlei Junior - 2023/03.

(ns src.1046
  (:require [clojure.string :as str]))

(defn main []
  (let [horas (mapv #(Integer. %) (str/split (read-line) #"\s+"))]
    (printf "O JOGO DUROU %d HORA(S)%n" (if (>= (horas 0) (horas 1))
                                          (- (+ (horas 1) 24) (horas 0))
                                          (- (horas 1) (horas 0))))))

(main)