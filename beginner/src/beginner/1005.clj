;; Clojure Studies - Beginner 1005.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (printf X): Imprime X formatado
;; (Float. X): Converte X para um java.lang.Float
;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String

(ns beginner.1005)

(defn main []
  (printf "MEDIA = %.5f%n"
          (/ (+ (* (Float. (read-line)) 3.5)
                (* (Float. (read-line)) 7.5)) 11)))

(main)