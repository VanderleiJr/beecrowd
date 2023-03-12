;; Clojure Studies - Beginner 1018.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (let [X Y]): Copia o dados de Y para o símbolo X
;; (Integer. X): Converte X para um java.lang.Integer
;; (printf X): Imprime X formatado
;; (println X): Imprime X, ao final, pula uma linha
;; (loop [X Y] Z): Entre X e Y, se assemelha ao (let). Z irá repetir a cada iteração
;; (when X Y): Realiza Y se X for true. Senão, retorna nil
;; (quot X Y): Quosciente da divisão de X por Y
;; (rem X Y): Resto da divisão de X por Y
;; (first X): Retorna o primeiro elemento da coleção X
;; (rest X): Retorna todos elementos da coleção X, exceto o último
;; (recur X): Retorna ao inicio do Loop, levando X

(ns src.1018)

(defn main []
  (let [valor-inicial (Integer. (read-line))]
    (println valor-inicial)
    (loop [valor valor-inicial notas [100 50 20 10 5 2 1]]
      (when (not-empty notas)
        (printf "%s nota(s) de R$ %s,00%n" (quot valor (first notas)) (first notas))
        (recur (rem valor (first notas)) (rest notas))))))

(main)