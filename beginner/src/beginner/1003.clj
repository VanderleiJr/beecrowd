;; Clojure Studies - Beginner 1003.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (println X): Imprime X, pula uma linha
;; (Integer. X): Converte X para um java.lang.Integer
;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String


(ns beginner.1003)

(defn main []
  (println "SOMA =" (+ (Integer. (read-line)) (Integer. (read-line)))))

(main)
