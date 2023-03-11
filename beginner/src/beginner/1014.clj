;; Clojure Studies - Beginner 1014.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (printf X): Imprime X formatado
;; (Integer. X): Converte X para um java.lang.Integer
;; (Float. X): Converte X para um java.lang.Float

(ns beginner.1014)
(defn main []
  (printf "%.3f km/l%n"
          (/ (Integer. (read-line)) (Float. (read-line)))))

(main)
