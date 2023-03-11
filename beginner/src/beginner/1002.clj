;; Clojure Studies - Beginner 1002.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (printf X): Imprime X formatado
;; (Double. X): Converte X para java.lang.Double
;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String

(ns beginner.1002)

(defn main []
  (printf "A=%.4f%n" (* 3.14159 (Math/pow (Double. (read-line)) 2))))

(main)