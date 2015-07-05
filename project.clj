(defproject torrential "0.1.0-SNAPSHOT"
  :description "A minimalist Clojure BitTorrent client."
  :url "https://github.com/RadicalZephyr/torrential"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/RadicalZephyr/torrential.git"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [bencode "0.2.5"]]

  :plugins [[lein-midje "3.0.0"]]

  :profiles {:dev {:dependencies [[midje "1.7.0-beta1"]]}
             :uberjar {:aot :all}}

  :main ^:skip-aot torrential.core
  :target-path "target/%s")
