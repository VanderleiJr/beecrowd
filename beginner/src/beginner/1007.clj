;; Clojure Studies - Beginner 1007.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (println): Imprime um ARG e, ao final, pula uma linha.
;; (int x): Transforma num inteiro, remove casas decimais.
;;; (Float/parseFloat): Converte um ARG para um java.lang.Float
;;;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String

(ns beginner.1007)
(println "DIFERENCA ="
         (int
          (- (* (Float/parseFloat (read-line)) (Float/parseFloat (read-line)))
             (* (Float/parseFloat (read-line)) (Float/parseFloat (read-line))))))