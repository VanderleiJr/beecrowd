;; Clojure Studies - Beginner 1017.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (printf X): Imprime X formatado
;; (Integer. X): Converte X para um java.lang.Integer
;; (read-line): Lê o valor digitado pelo usuário, retorna tipo java.lang.String

(ns src.1017)

(defn main []
  (printf "%.3f%n" (/ (* (Integer. (read-line)) (Integer. (read-line))) 12.0)))

(main)