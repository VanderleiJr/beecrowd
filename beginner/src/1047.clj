;; Clojure Studies - Beginner 1047.
;; Vanderlei Junior - 2023/03.

(ns src.1047
  (:require [clojure.string :as str]))

(defn main []
  (let [tempo (mapv #(Integer. %) (str/split (read-line) #"\s+"))
        minutos (if (<= (tempo 1) (tempo 3))
                  (- (tempo 3) (tempo 1))
                  (- 60 (- (tempo 1) (tempo 3))))
        horas (cond
                (< (tempo 0) (tempo 2)) (if (<= (tempo 1) (tempo 3))
                                          (- (tempo 2) (tempo 0))
                                          (dec (- (tempo 2) (tempo 0))))
                (> (tempo 0) (tempo 2)) (if (<= (tempo 1) (tempo 3))
                                          (- 24 (- (tempo 0) (tempo 2)))
                                          (- 23 (- (tempo 0) (tempo 2))))
                :else (cond
                        (= (tempo 1) (tempo 3)) 24
                        (> (tempo 1) (tempo 3)) 23
                        (< (tempo 1) (tempo 3)) 0))]
    (printf "O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n" horas minutos)))

(main)