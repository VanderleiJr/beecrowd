;; Clojure Studies - Beginner 1017.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (println X): Imprime X, ao final, pula uma linha.
;; (format "%.Xf"): Formata um número para ter X casas decimais.
;;; (Integer/parseInt X): Converte X para um java.lang.Long.
;;;; (read-line): Lê o valor digitado pelo usuário, retorna tipo java.lang.String

(ns beginner.1017)
(println 
 (format "%.3f" 
         (/ (* (Integer/parseInt (read-line)) (Integer/parseInt (read-line))) 12.0)))