;; Clojure Studies - Beginner 1007.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (println X): Imprime X, pula uma linha
;; (int X): Transforma X num inteiro, remove casas decimais
;; (Integer. X): Converte X para um java.lang.Integer
;; (read-line): Lê o valor digitado pelo usuário, retorna sempre no tipo java.lang.String

(ns beginner.1007)

(defn main []
  (println "DIFERENCA ="
           (- (* (Integer. (read-line)) (Integer. (read-line)))
              (* (Integer. (read-line)) (Integer. (read-line))))))

(main)