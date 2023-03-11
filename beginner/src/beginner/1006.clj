;; Clojure Studies - Beginner 1006.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (printf X): Imprime X formatado
;; (Float. X): Converte X para um java.lang.Float
;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String

(ns beginner.1006)

(defn main []
  (printf "MEDIA = %.1f%n"
          (/ (+ (* (Float. (read-line)) 2)
                (* (Float. (read-line)) 3)
                (* (Float. (read-line)) 5)) 10)))

(main)