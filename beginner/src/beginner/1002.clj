;; Clojure Studies - Beginner 1002.
;; Vanderlei Junior, 2023/03.

;; Funções Utilizadas:
; (def x y): Cria o símbolo x com o valor y.
; (println): Imprime um ARG e, ao final, pula uma linha.
;; (str x y): Concatena x com y, transforma numa string, sem espaços.
;;; (format "%.xf"): Formata um número para ter x casas decimais.
;;;; (Double/parseDouble): Converte um ARG para um java.lang.Integer
;;;;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String

(ns beginner.1002)

(def pi 3.14159)

(println
 (str "A="
      (format "%.4f"
              (* pi (Math/pow (Double/parseDouble (read-line)) 2)))))

