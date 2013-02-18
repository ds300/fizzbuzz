(doseq [n (rest (range 101))]
  (println
    (condp #(= 0 (mod %2 %1)) n
      15 "fizzbuzz"
      5 "buzz"
      3 "fizz"
      n)))
