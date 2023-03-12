;; Clojure Studies - Beginner 1008.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (println X): Imprime X, pula uma linha
;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String
;; (printf X): Imprime X formatado
;; (Integer. X): Converte X para um java.lang.Integer
;; (Float. X): Converte X para um java.lang.Float

(ns src.1008)

(defn main []
  (println "NUMBER =" (read-line))
  (printf "SALARY = U$ %.2f%n" (* (Integer. (read-line)) (Float. (read-line)))))

(main)