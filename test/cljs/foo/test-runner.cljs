(ns foo.test-runner
  (:require
   [cljs.test :refer-macros [run-tests]]
   [foo.core-test]))

(enable-console-print!)

(defn runner []
  (if (cljs.test/successful?
       (run-tests
        'foo.core-test))
    0
    1))
