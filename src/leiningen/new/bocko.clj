(ns leiningen.new.bocko
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
    [leiningen.core.main :as main]))

(def render (renderer "bocko"))

(defn bocko
  "FIXME: write documentation"
  [name]
  (let [data {:name      name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' bocko project.")
    (->files data
      ["README.md" (render "README.md" data)]
      ["project.clj" (render "project.clj" data)])))
