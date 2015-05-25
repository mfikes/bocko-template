# Usage

1. `lein repl`
2. Then in the REPL `(require '[bocko.core :refer :all])`

Now you can plot:
```clojure
(plot 2 3)      ;; plots a point on the screen

(color :pink)   ;; changes the color to pink
(plot 5 5)

(scrn 5 5)      ;; => :pink

(hlin 3 9 10)   ;; draws a horizontal line

(clear)         ;; clears screen
```

The commands comprise `color`, `plot`, `scrn`, `hlin`, `vlin`, and `clear`.

To get the documentation for a command, type, for example, `(doc color)` in the REPL.
