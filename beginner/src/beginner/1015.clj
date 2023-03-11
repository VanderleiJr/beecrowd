;; Clojure Studies - Beginner 1015.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (:require [X]): Importar outras biblitecas do Clojure
;; [:as X]: Atribui um alias X para bibliteca importada
;; (defn X Y): Define a função Y com o nome X
;; (mapv X Y): Aplica a função X em todos elementos da coleção Y, retorna um vetor
;; (clojure.string/split X Y): Divide a entrada X, utilizando o parametro Y(Regex)
;; (let [X Y]): Copia o dados de Y para o símbolo X
;; (read-line): Lê o valor digitado pelo usuário, retorna tipo java.lang.String
;; (printf X): Imprime X formatado
;; (Math/sqrt X): Raiz Quadrada, raiz quadrada de X
;; (Math/pow X Y): Exponenciação, X elevado a Y

(ns beginner.1015
  (:require [clojure.string :as str]))

(defn string-to-float [dados]
  (mapv #(Float. %) (str/split dados #"\s+")))

(defn main []
  (let [pontoA (string-to-float (read-line))
        pontoB (string-to-float (read-line))]
    (printf "%.4f%n" (Math/sqrt (+ (Math/pow (- (pontoB 0) (pontoA 0)) 2)
                                   (Math/pow (- (pontoB 1) (pontoA 1)) 2))))))

(main)