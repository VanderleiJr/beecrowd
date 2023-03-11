;; Clojure Studies - Beginner 1009.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String
;; (printf X): Imprime X formatado
;; (Float. X): Converte X para um java.lang.Float

(ns beginner.1009)

(defn main []
  (let [_ (read-line)])
  (printf "TOTAL = R$ %.2f%n"
           (+ (Float. (read-line))
              (* (Float. (read-line)) 0.15))))

(main)