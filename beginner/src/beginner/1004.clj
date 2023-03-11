;; Clojure Studies - Beginner 1004.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (println X): Imprime X, pula uma linha
;; (Integer. X): Converte X para um java.lang.Integer
;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String

(ns beginner.1004)

(defn main []
  (println "PROD =" (* (Integer. (read-line)) (Integer. (read-line)))))

(main)