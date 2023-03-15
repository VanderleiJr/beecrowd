;; Clojure Studies - Beginner 1047.
;; Vanderlei Junior - 2023/03.

(ns src.1047
  (:require [clojure.string :as str]))

(defn main []
  (let [tempo (mapv #(Integer. %) (str/split (read-line) #"\s+"))
        inicio (+ (* (tempo 0) 60) (tempo 1))  ; converte horas e minutos iniciais para minutos
        fim (+ (* (tempo 2) 60) (tempo 3))     ; converte horas e minutos finais para minutos
        duracao (if (<= fim inicio) (+ fim 1440 (- inicio)) (- fim inicio))] ; calcula a duração em minutos
    (println "O JOGO DUROU" (quot duracao 60) "HORA(S) E" (mod duracao 60) "MINUTO(S)")))

(main)