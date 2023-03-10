;; Clojure Studies - Beginner 1016.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (println X): Imprime X, ao final, pula uma linha.
;; (Integer/parseInt X): Converte X para um java.lang.Long.
;;; (read-line): Lê o valor digitado pelo usuário, retorna tipo java.lang.String

(ns beginner.1016)
(println (* (Integer/parseInt (read-line)) 2) "minutos")