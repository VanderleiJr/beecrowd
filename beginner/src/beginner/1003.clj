;; Clojure Studies - Beginner 1003.
;; Vanderlei Junior, 2023/03.

;; Funções Utilizadas:
; (println): Imprime um ARG e, ao final, pula uma linha.
;; (Integer/parseInt): Converte um ARG para um java.lang.Integer
;;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String


(ns beginner.1003)

(println "SOMA =" (+ (Integer/parseInt (read-line)) (Integer/parseInt (read-line))))