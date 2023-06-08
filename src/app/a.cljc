(ns app.a
  (:require #?(:cljd [app.b :as greeter]
               :clj [app.c :as greeter])))

(defn call-say-hi []
  #?(:cljd (greeter/say-hi)
     :clj (println "not implemented")))
