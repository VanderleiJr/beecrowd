;; Clojure Studies - Beginner 1043.
;; Vanderlei Junior - 2023/03.

(ns src.1043
  (:require [clojure.string :as str]))

(defn main []
  (let [retas (mapv #(Float. %) (str/split (read-line) #"\s+"))
        ordenada (vec (sort retas))]
    (cond
      (> (+ (ordenada 0) (ordenada 1)) (ordenada 2)) (printf "Perimetro = %.1f%n" (apply + retas))
      :else (printf "Area = %.1f%n" (/ (* (+ (retas 0) (retas 1)) (retas 2)) 2)))))

(main)