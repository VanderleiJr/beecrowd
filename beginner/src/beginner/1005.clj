;; Clojure Studies - Beginner 1005.
;; Vanderlei Junior, 2023/03.

;; Funções Utilizadas:
; (println): Imprime um ARG e, ao final, pula uma linha.
;; (format "%.xf"): Formata um número para ter x casas decimais.
;;; (Float/parseFloat): Converte um ARG para um java.lang.Float
;;;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String

(ns beginner.1005)

(println "MEDIA =" 
         (format "%.5f"
                 (/ (+ (* (Float/parseFloat (read-line)) 3.5)
                       (* (Float/parseFloat (read-line)) 7.5))
                    11)))