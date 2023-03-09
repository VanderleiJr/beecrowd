;; Clojure Studies - Beginner 1015.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (:require [X]): Importar outras biblitecas do Clojure.
;; [:as X]: Atribui um alias X para bibliteca importada.
; (defn X Y): Define a função Y com o nome X.
;; (mapv X Y): Aplica a função X em todos elementos da coleção Y, retorna um vetor.
;;; (clojure.string/split X Y): Divide a entrada X, utilizando o parametro Y(Regex).
; (let [X Y]): Copia o dados de Y para o símbolo X.
;; (read-line): Lê o valor digitado pelo usuário, retorna tipo java.lang.String
;; (println X): Imprime X, ao final, pula uma linha.
;;; (format "%.Xf"): Formata um número para ter X casas decimais.
;;; (Math/sqrt X): Raiz Quadrada, raiz quadrada de X.
;;;; (Math/pow X Y): Exponenciação, X elevado a Y.
;;;;; (get X Y): Retorna o elemento Y da coleção X.

(ns beginner.1015
  (:require [clojure.string :as str]))

(defn list-to-float [dados]
  (mapv #(Float/parseFloat %) (str/split dados #"\s+")))

(let [pontoA (list-to-float (read-line))
      pontoB (list-to-float (read-line))]
  (println (format "%.4f"
                   (Math/sqrt (+ (Math/pow (- (get pontoB 0) (get pontoA 0)) 2)
                                 (Math/pow (- (get pontoB 1) (get pontoA 1)) 2))))))