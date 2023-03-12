;; Clojure Studies - Beginner 1012.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (:require [X]): Importar outras biblitecas do Clojure
;; [:as X]: Atribui um alias X para bibliteca importada
;; (let [X Y]): Copia o dados de Y para o símbolo X
;; (mapv X Y): Aplica a função X em todos elementos da coleção Y, retorna um vetor
;; (Float. X): Converte X para um java.lang.Float
;; (clojure.string/split X Y): Divide a entrada X, utilizando o parametro Y(Regex)
;; (read-line): Lê o valor digitado pelo usuário, retorna tipo java.lang.String
;; (printf X): Imprime X formatado
;; (Math/pow X Y): Exponenciação, X elevado a Y

(ns src.1012
  (:require [clojure.string :as str]))

(defn main []
  (let [dados (mapv #(Float/parseFloat %) (str/split (read-line) #"\s+"))]
    (printf "TRIANGULO: %.3f%n" (/ (* (dados 0) (dados 2)) 2))
    (printf "CIRCULO: %.3f%n" (* (Math/pow (dados 2) 2) 3.14159))
    (printf "TRAPEZIO: %.3f%n" (/ (* (+ (dados 0) (dados 1)) (dados 2)) 2))
    (printf "QUADRADO: %.3f%n" (Math/pow (dados 1) 2))
    (printf "RETANGULO: %.3f%n" (* (dados 0) (dados 1)))))

(main)