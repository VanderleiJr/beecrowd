;; Clojure Studies - Beginner 1012.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (:require [X]): Importar outras biblitecas do Clojure.
;; [:as X]: Atribui um alias X para bibliteca importada.
; (let [X Y]): Copia o dados de Y para o símbolo X.
;; (mapv X Y): Aplica a função X em todos elementos da coleção Y, retorna um vetor.
;;; (Float/parseFloat X): Converte X para um java.lang.Float.
;;; (clojure.string/split X Y): Divide a entrada X, utilizando o parametro Y(Regex).
;;;; (read-line): Lê o valor digitado pelo usuário, retorna tipo java.lang.String
; (println X): Imprime X, ao final, pula uma linha.
;; (format "%.Xf"): Formata um número para ter X casas decimais.
;;; (Math/pow X Y): Exponenciação, X elevado a Y.
;;; (get X Y): Retorna o elemento Y da coleção X.

(ns beginner.1012
  (:require [clojure.string :as str]))

(let [dados (mapv #(Float/parseFloat %) (str/split (read-line) #"\s+"))]
  (println "TRIANGULO:"
           (format "%.3f"
                   (/ (* (get dados 0) (get dados 2)) 2)))
  (println "CIRCULO:"
           (format "%.3f"
                   (* (Math/pow (get dados 2) 2) 3.14159)))
  (println "TRAPEZIO:"
           (format "%.3f"
                   (/ (* (+ (get dados 0) (get dados 1)) (get dados 2)) 2)))
  (println "QUADRADO:"
           (format "%.3f"
                   (Math/pow (get dados 1) 2)))
  (println "RETANGULO:"
           (format "%.3f"
                   (* (get dados 0) (get dados 1)))))