;; Clojure Studies - Beginner 1035.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (:require [X]): Importar outras biblitecas do Clojure
;; [:as X]: Atribui um alias X para bibliteca importada
;; (mapv X Y): Aplica a função X em todos elementos da coleção Y, retorna um vetor
;; (clojure.string/split X Y): Divide a entrada X, utilizando o parametro Y(Regex)
;; (let [X Y]): Copia o dados de Y para o símbolo X
;; (read-line): Lê o valor digitado pelo usuário, retorna tipo java.lang.String
;; (if X Y Z): Se X for true, faz Y. Senão, faz Z
;; (pos? X): Retorna true se X for positivo
;; (even? X): Retorna true se X for par
;; (println X): Imprime X, ao final, pula uma linha

(ns beginner.1035
  (:require [clojure.string :as str]))

(defn main []
  (let [valores (mapv #(Integer. %) (str/split (read-line) #"\s+"))]
    (if (and
         (> (valores 1) (valores 2))
         (> (valores 3) (valores 0))
         (> (+ (valores 2) (valores 3)) (+ (valores 0) (valores 1)))
         (pos? (valores 2))
         (pos? (valores 3))
         (even? (valores 0)))
      (println "Valores aceitos")
      (println "Valores nao aceitos"))))

(main)