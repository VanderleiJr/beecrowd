;; Clojure Studies - Beginner 1006.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (println): Imprime um ARG e, ao final, pula uma linha.
;; (format "%.xf"): Formata um número para ter x casas decimais.
;;; (Float/parseFloat): Converte um ARG para um java.lang.Float
;;;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String

(ns beginner.1006)

(println "MEDIA ="
         (format "%.1f"
                 (/ (+ (* (Float/parseFloat (read-line)) 2)
                       (* (Float/parseFloat (read-line)) 3)
                       (* (Float/parseFloat (read-line)) 5))
                    10)))