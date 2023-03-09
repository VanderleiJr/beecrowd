;; Clojure Studies - Beginner 1011.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (println): Imprime um ARG e, ao final, pula uma linha.
;; (format "%.xf"): Formata um número para ter x casas decimais.
;; (Math/pow X Y): Exponenciação, X elevado a Y.
;;;; (Float/parseFloat): Converte um ARG para um java.lang.Float.

(ns beginner.1011)

(println "VOLUME ="
         (format "%.3f"
                 (* 4/3
                    3.14159
                    (Math/pow (Float/parseFloat (read-line)) 3))))