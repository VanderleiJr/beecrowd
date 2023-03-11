;; Clojure Studies - Beginner 1010.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (:require [X]): Importar outras biblitecas do Clojure
;; [:as X]: Atribui um alias X para bibliteca importada
;; (defn X Y): Define a função Y com o nome X
;; (mapv X Y): Aplica a função X em todos elementos da coleção Y, retorna um vetor
;; (clojure.string/split X Y): Divide a entrada X, utilizando o parametro Y(Regex)
;; (if X Y Z): Verifica X, true executa Y, false executa Z
;; (re-matches X Y): Verifica string X com os parametros Y(Regex)
;; (let [X Y]): Copia o dados de Y para o símbolo X
;; (read-line): Lê o valor digitado pelo usuário, retorna tipo java.lang.String
;; (printf X): Imprime X formatado

(ns beginner.1010
  (:require [clojure.string :as str]))

(defn return-to-list [dados]
  (mapv #(if (re-matches #"\d+\.\d+" %)
           (Float. %)
           (Integer. %))
        (str/split dados #"\s+")))

(defn main []
  (let [dadosA (return-to-list (read-line))
        dadosB (return-to-list (read-line))]
    (printf "VALOR A PAGAR: R$ %.2f%n"
            (+ (* (dadosA 1) (dadosA 2))
               (* (dadosB 1) (dadosB 2))))))

(main)