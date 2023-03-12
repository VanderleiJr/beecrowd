;; Clojure Studies - Beginner 1038.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (:require [X]): Importar outras biblitecas do Clojure
;; [:as X]: Atribui um alias X para bibliteca importada
;; (let [X Y]): Copia o dados de Y para o símbolo X
;; (mapv X Y): Aplica a função X em todos elementos da coleção Y, retorna um vetor
;; (clojure.string/split X Y): Divide a entrada X, utilizando o parametro Y(Regex)
;; (printf X): Imprime X formatado

(ns src.1038
  (:require [clojure.string :as str]))

(defn main []
  (let [precos {1 4.00 2 4.50 3 5.00 4 2.00 5 1.50}
        pedido (mapv #(Integer. %) (str/split (read-line) #"\s+"))]
    (printf "Total: R$ %.2f%n" (* (precos (pedido 0)) (pedido 1)))))

(main)