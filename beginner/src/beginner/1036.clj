;; Clojure Studies - Beginner 1036.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (:require [X]): Importar outras biblitecas do Clojure
;; [:as X]: Atribui um alias X para bibliteca importada
;; (defn X Y): Define a função Y com o nome X
;; (Math/sqrt X): Raiz Quadrada, raiz quadrada de X
;; (Math/pow X Y): Exponenciação, X elevado a Y
;; (let [X Y]): Copia o dados de Y para o símbolo X
;; (mapv X Y): Aplica a função X em todos elementos da coleção Y, retorna um vetor
;; (zero? X): Retorna true se X for zero
;; (neg? X): Retorna true se X for negativo
;; (apply X Y): Aplica X em Y, preparando os valores de Y como argumento de X
;; (printf X): Imprime X formatado
;; (println X): Imprime X, ao final, pula uma linha

(ns beginner.1036
  (:require [clojure.string :as str]))

(defn delta [x y z]
  (- (Math/pow y 2) (* 4 x z)))

(defn r1 [a b c]
  (/ (+ (- b) (Math/sqrt (delta a b c))) (* 2 a)))

(defn r2 [a b c]
  (/ (- (- b) (Math/sqrt (delta a b c))) (* 2 a)))

(defn main []
  (let [valores (mapv #(Double. %) (str/split (read-line) #"\s+"))]
    (if
     (or (zero? (valores 0)) (neg? (apply delta valores))) (println "Impossivel calcular")
     (do (printf "R1 = %.5f%n" (apply r1 valores))
         (printf "R2 = %.5f%n" (apply r2 valores))))))

(main)