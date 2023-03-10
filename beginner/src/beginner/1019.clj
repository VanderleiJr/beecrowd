;; Clojure Studies - Beginner 1019.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (let [X Y]): Copia o dados de Y para o símbolo X.
;; (Integer/parseInt X): Converte X para um java.lang.Long.
;;; (println X): Imprime X, ao final, pula uma linha.
;;;; (str X Y): Concatena X com Y, transforma em uma string.
;;;;; (quot X Y): Quosciente da divisão de X por Y.
;;;;;; (rem X Y): Resto da divisão de X por Y.

(ns beginner.1019)

(let [segundos (Integer/parseInt (read-line))]
  (println (str (quot segundos 3600) ":"
                (quot (rem segundos 3600) 60) ":"
                (rem (rem segundos 3600) 60))))
