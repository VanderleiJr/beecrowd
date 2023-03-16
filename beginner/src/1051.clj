;; Clojure Studies - Beginner 1051.
;; Vanderlei Junior - 2023/03.

(ns src.1051)

(defn main []
  (let [salario (BigDecimal. (read-line))
        valor-a (if (> salario 4500.00) (* 0.28 (- salario 4500.00M)) 0)
        valor-b (if (> salario 3000.01) (* 0.18 (- (min salario 4500.00M) 3000.01M)) 0)
        valor-c (if (> salario 2000.01) (* 0.08 (- (min salario 3000.00M) 2000.01M)) 0)
        ]
    (if (> 2000 salario )
      (println "Isento")
      (printf "R$ %.2f%n" (+ valor-a valor-b valor-c)))))

(main)