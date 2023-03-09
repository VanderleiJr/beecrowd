;; Clojure Studies - Beginner 1010.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (:require [X]): Importar outras biblitecas do Clojure.
;; [:as X]: Atribui um alias X para bibliteca importada.
; (defn X Y): Define a função Y com o nome X.
;; (mapv X Y): Aplica a função X em todos elementos da coleção Y, retorna um vetor.
;;; (clojure.string/split X Y): Divide a entrada X, utilizando o parametro Y(Regex).
;;; (if X Y Z): Verifica X, true executa Y, false executa Z.
;;;; (re-matches X Y): Verifica string X com os parametros Y(Regex).
; (let [X Y]): Copia o dados de Y para o símbolo X.
;; (read-line): Lê o valor digitado pelo usuário, retorna tipo java.lang.String
;; (println X): Imprime X, ao final, pula uma linha.
;;; (format "%.Xf"): Formata um número para ter X casas decimais.
;;;; (get X Y): Retorna o elemento Y da coleção X.

(ns beginner.1010
  (:require [clojure.string :as str]))

(defn return-to-list [dados]
  (mapv #(if (re-matches #"\d+\.\d+" %)
           (Float/parseFloat %)
           (Integer/parseInt %))
        (str/split dados #"\s+")))

(let [dadosA (return-to-list (read-line))
      dadosB (return-to-list (read-line))]
  (println "VALOR A PAGAR: R$"
           (format "%.2f"
                   (+ (* (get dadosA 1) (get dadosA 2))
                      (* (get dadosB 1) (get dadosB 2))))))
