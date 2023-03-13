;; Clojure Studies - Beginner 1042.
;; Vanderlei Junior - 2023/03.

(ns src.1042
  (:require [clojure.string :as str]))

(defn main []
  (let [valores (mapv #(Integer. %) (str/split (read-line) #"\s+"))]
    (run! println (sort valores))
    (println)
    (run! println valores)))

(main)