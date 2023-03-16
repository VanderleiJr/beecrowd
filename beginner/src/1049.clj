;; Clojure Studies - Beginner 1049.
;; Vanderlei Junior - 2023/03.

(ns src.1049)

(defn main []
  (let [x (read-line)
        y (read-line)
        z (read-line)]
    (case x
      "vertebrado" (case y
                     "ave" (case z
                             "carnivoro" (println "aguia")
                             "onivoro" (println "pomba"))
                     "mamifero" (case z
                                  "onivoro" (println "homem")
                                  "herbivoro" (println "vaca")))
      "invertebrado" (case y
                       "inseto" (case z
                                  "hematofago" (println "pulga")
                                  "herbivoro" (println "lagarta"))
                       "anelideo" (case z
                                    "hematofago" (println "sanguessuga")
                                    "onivoro" (println "minhoca"))))))

(main)