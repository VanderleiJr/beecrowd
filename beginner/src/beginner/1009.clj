;; Clojure Studies - Beginner 1009.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String
; (println): Imprime um ARG e, ao final, pula uma linha.
;; (format "%.xf"): Formata um número para ter x casas decimais.
;;; (Float/parseFloat): Converte um ARG para um java.lang.Float


(ns beginner.1009)
(read-line) ; Ignorando o nome, pois não faz diferença ao exercício
(println "TOTAL = R$"
         (format "%.2f"
                 (+ (Float/parseFloat (read-line))
                    (* (Float/parseFloat (read-line)) 0.15))))