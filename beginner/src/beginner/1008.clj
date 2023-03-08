;; Clojure Studies - Beginner 1008.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (println): Imprime um ARG e, ao final, pula uma linha.
;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String
;; (format "%.xf"): Formata um número para ter x casas decimais.
;;; (Float/parseFloat): Converte um ARG para um java.lang.Float

(ns beginner.1008)

(println "NUMBER =" (read-line))
(println "SALARY = U$"
         (format "%.2f"
                 (* (Integer/parseInt (read-line)) (Float/parseFloat (read-line)))))