(ns blaster.clj-fstring-test
  (:require [clojure.test :refer :all]
            [blaster.clj-fstring :refer [f-str]]))

(deftest sum-test
  (is (f-str "{(+ 1 1)}") "2"))

(deftest escape-test
  (is (f-str "'{bar}") "{bar}"))

(deftest escapte-test-2
  (is (f-str "'{bar} {(+ 1 2)}") "{bar} 3"))

(deftest let-test
  (let [where "Sparta"]
    (is (f-str "This is {where}!") "This is Sparta!")))
