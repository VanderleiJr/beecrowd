;; Clojure Studies - Beginner 1018.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
; (let [X Y]): Copia o dados de Y para o símbolo X.
;; (Integer/parseInt X): Converte X para um java.lang.Long.
;; (println X): Imprime X, ao final, pula uma linha.
;;; (loop [X Y] Z): Entre X e Y, se assemelha ao (let). Z irá repetir a cada iteração;
;;;; (when X Y): Realiza Y se X for true. Senão, retorna nil.
;;;;; (str X Y): Concatena X com Y, transforma em uma string.
;;;;;; (quot X Y): Quosciente da divisão de X por Y.
;;;;;; (rem X Y): Resto da divisão de X por Y.
;;;;;; (first X): Retorna o primeiro elemento da coleção X.
;;;;;; (rest X): Retorna todos elementos da coleção X, exceto o último.

(ns beginner.1018)

(let [valor-inicial (Integer/parseInt (read-line))]
  (println valor-inicial)
  (loop [valor valor-inicial notas [100 50 20 10 5 2 1]]
    (when (not-empty notas)
      (println (str (quot valor (first notas)) " nota(s) de R$ " (first notas) ",00"))
      (recur (rem valor (first notas)) (rest notas)))))