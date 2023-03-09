;; Clojure Studies - Beginner 1014.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (println X): Imprime X, ao final, pula uma linha.
;; (format "%.Xf"): Formata um número para ter X casas decimais.
;;; (Integer/parseInt X): Converte X para um java.lang.Long.
;;; (Float/parseFloat X): Converte X para um java.lang.Float.

(ns beginner.1014)
(println
 (format "%.3f"
         (/ (Integer/parseInt (read-line)) (Float/parseFloat (read-line)))) "km/l")
