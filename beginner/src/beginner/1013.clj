;; Clojure Studies - Beginner 1013.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (:require [X]): Importar outras biblitecas do Clojure.
;; [:as X]: Atribui um alias X para bibliteca importada.
; (println X): Imprime X, ao final, pula uma linha.
; (reduce X Y): Reduz a coleção Y, utilizando a função X de 2 em 2 elementos. 
;; (mapv X Y): Aplica a função X em todos elementos da coleção Y, retorna um vetor.
;;; (clojure.string/split X Y): Divide a entrada X, utilizando o parametro Y(Regex).

(ns beginner.1013
  (:require [clojure.string :as str]))

(println 
 (reduce max (mapv #(Integer/parseInt %) (str/split (read-line) #"\s+")))
 "eh o maior")