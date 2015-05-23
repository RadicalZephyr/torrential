(defproject torrential "0.1.0-SNAPSHOT"
  :description "A minimalist Clojure BitTorrent client."
  :url "https://github.com/RadicalZephyr/torrential"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot torrential.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
