;; Clojure Studies - Beginner 1037.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (let [X Y]): Copia o dados de Y para o símbolo X
;; (BigDecimal. X): Converte X para um java.math.BigDecimal
;; (cond X Y :else Z): Se X for verdade, faz Y. Senão, faz Z
;; (<= X Y Z): (X <= Y <= Z)?
;; (println X): Imprime X, ao final, pula uma linha

(ns src.1037)

(defn main []
  (let [valor (BigDecimal. (read-line))]
    (cond
      (<= 0 valor 25M) (println "Intervalo [0,25]")
      (<= 25M valor 50M) (println "Intervalo (25,50]")
      (<= 50M valor 75M) (println "Intervalo (50,75]")
      (<= 75M valor 100M) (println "Intervalo (75,100]")
      :else (println "Fora de intervalo"))))

(main)