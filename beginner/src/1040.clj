;; Clojure Studies - Beginner 1040.
;; Vanderlei Junior - 2023/03.

;; Dica:
;; Valor truncado antes da divisão da média, isso resolve o problema decimal

;; Funções Utilizadas:
;; (:require [X]): Importar outras biblitecas do Clojure
;; [:as X]: Atribui um alias X para bibliteca importada
;; (defn X Y): Define a função Y com o nome X
;; (mapv X Y): Aplica a função X em todos elementos da coleção Y, retorna um vetor
;; (clojure.string/split X Y): Divide a entrada X, utilizando o parametro Y(Regex)
;; (let [X Y]): Copia o dados de Y para o símbolo X
;; (read-line): Lê o valor digitado pelo usuário, retorna tipo java.lang.String
;; (if X Y Z): Se X for true, faz Y. Senão, faz Z
;; (printf X): Imprime X formatado
;; (println X): Imprime X, ao final, pula uma linha
;; (int X): Conver o valor X para um inteiro, removendo a parte decimal (truncamento)


(ns src.1040
  (:require [clojure.string :as str]))

(defn main []
  (let [notas (mapv #(Double. %) (str/split (read-line) #"\s+"))
        media (/ (int (+ (* 2 (notas 0)) (* 3 (notas 1)) (* 4 (notas 2)) (notas 3))) 10.0)]
    (printf "Media: %.1f%n" media)
    (cond
      (>= media 7) (println "Aluno aprovado.")
      (< media 5) (println "Aluno reprovado.")
      :else (do (println "Aluno em exame.")
                (let [exame (Double. (read-line))
                      nova-media (/ (+ media exame) 2)]
                  (printf "Nota do exame: %.1f%n" exame)
                  (if (>= nova-media 5) 
                    (println "Aluno aprovado.")
                    (println "Aluno reprovado."))
                  (printf "Media final: %.1f%n" nova-media))))))

(main)