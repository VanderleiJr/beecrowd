;; Clojure Studies - Beginner 1011.
;; Vanderlei Junior - 2023/03.

;; Funções Utilizadas:
;; (printf X): Imprime X formatado
;; (Math/pow X Y): Exponenciação, X elevado a Y
;; (Float. X): Converte X para um java.lang.Float

(ns beginner.1011)

(defn main []
  (printf "VOLUME = %.3f%n" (* 4/3
                             3.14159
                             (Math/pow (Float. (read-line)) 3))))

(main)