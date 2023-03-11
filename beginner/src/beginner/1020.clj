;; Clojure Studies - Beginner 1020.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (let [X Y]): Copia o dados de Y para o símbolo X
;; (Integer. X): Converte X para um java.lang.Long
;; (println X): Imprime X, ao final, pula uma linha
;; (quot X Y): Quosciente da divisão de X por Y
;; (rem X Y): Resto da divisão de X por Y

(ns beginner.1020)

(defn main []
  (let [dias (Integer. (read-line))]
    (println (quot dias 365) "ano(s)")
    (println (quot (rem dias 365) 30) "mes(es)")
    (println (rem (rem dias 365) 30) "dia(s)")))

(main)