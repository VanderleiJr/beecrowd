;; Clojure Studies - Beginner 1048.
;; Vanderlei Junior - 2023/03.

(ns src.1048)

(defn main []
  (let [salario (Float. (read-line))
        reajuste (cond
                   (<= 0 salario 400.00) 0.15
                   (<= 400.01 salario 800.00) 0.12
                   (<= 800.01 salario 1200.00) 0.10
                   (<= 1200.01 salario 2000.00) 0.07
                   :else 0.04)]
    (printf "Novo salario: %.2f%n" (+ salario(* salario reajuste)))
    (printf "Reajuste ganho: %.2f%n" (* salario reajuste))
    (printf "Em percentual: %d %%%n" (int (* 100 reajuste)))))

(main)