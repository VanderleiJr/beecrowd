;; Clojure Studies - Beginner 1016.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (println X): Imprime X, ao final, pula uma linha
;; (Integer. X): Converte X para um java.lang.Integer
;;; (read-line): Lê o valor digitado pelo usuário, retorna tipo java.lang.String

(ns beginner.1016)

(defn main []
  (println (* (Integer. (read-line)) 2) "minutos"))

(main)