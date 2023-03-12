;; Clojure Studies - Beginner 1019.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (let [X Y]): Copia o dados de Y para o símbolo X
;; (Integer.): Converte X para um java.lang.Integer
;; (printf X): Imprime X formatado
;; (quot X Y): Quosciente da divisão de X por Y
;; (rem X Y): Resto da divisão de X por Y

(ns src.1019)

(defn main []
  (let [segundos (Integer. (read-line))]
    (printf "%s:%s:%s%n"
            (quot segundos 3600)
            (quot (rem segundos 3600) 60)
            (rem (rem segundos 3600) 60))))

(main)