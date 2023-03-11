;; Clojure Studies - Beginner 1021.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (let [X Y]): Copia o dados de Y para o símbolo X
;; (BigDecimal X): Converte X para um java.math.BigDecimal
;; (printf X): Imprime X formatado
;; (println X): Imprime X, ao final, pula uma linha
;; (loop [X Y] Z): Entre X e Y, se assemelha ao (let). Z irá repetir a cada iteração
;; (when X Y): Realiza Y se X for true. Senão, retorna nil
;; (if X Y Z): Se X for true, faz Y. Senão, faz Z
;; (quot X Y): Quosciente da divisão de X por Y
;; (rem X Y): Resto da divisão de X por Y
;; (first X): Retorna o primeiro elemento da coleção X
;; (rest X): Retorna todos elementos da coleção X, exceto o último
;; (recur X): Retorna ao inicio do Loop, levando X
;; (not-empty X): Se a coleção X não for vazia, retorna true

(ns beginner.1021
  (:import [java.math BigDecimal]))

(defn separa-moedas [valor-inicial]
  (println "MOEDAS:")
  (loop [valor valor-inicial moedas [1.00M 0.50M 0.25M 0.10M 0.05M 0.01M]]
    (when (not-empty moedas)
      (printf "%.0f moeda(s) de R$ %.2f%n" (quot valor (first moedas)) (first moedas))
      (recur (rem valor (first moedas)) (rest moedas)))))

(defn main []
  (let [valor-inicial (BigDecimal. (read-line))]
    (println "NOTAS:")
    (loop [valor valor-inicial notas [100 50 20 10 5 2]]
      (if (not-empty notas)
        (do (printf "%.0f nota(s) de R$ %.2f%n" (quot valor (first notas)) (float (first notas)))
            (recur (rem valor (first notas)) (rest notas)))
        (separa-moedas valor)))))

(main)
