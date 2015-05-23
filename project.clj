(defproject torrential "0.1.0-SNAPSHOT"
  :description "A minimalist Clojure BitTorrent client."
  :url "https://github.com/RadicalZephyr/torrential"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/RadicalZephyr/torrential.git"}

  :dependencies [[org.clojure/clojure "1.6.0"]]

  :test-paths ["spec"]

  :plugins [[speclj "3.2.0"]]

  :profiles {:dev {:dependencies [[speclj "3.2.0"]]}
             :uberjar {:aot :all}}

  :main ^:skip-aot torrential.core
  :target-path "target/%s")
