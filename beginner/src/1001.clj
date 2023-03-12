;; Clojure Studies - Beginner 1001.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (println X): Imprime X, pula uma linha
;; (Integer. X): Converte um X para um java.lang.Integer
;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String

(ns src.1001)

(defn main []
  (println "X =" (+ (Integer. (read-line)) (Integer. (read-line)))))

(main)