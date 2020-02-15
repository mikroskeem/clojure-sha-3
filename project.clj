(defproject clojure-sha-3 "0.1.0"
  :description ""
  :url ""
  :deploy-repositories [["releases"  {:url "https://repo.wut.ee/repository/mikroskeem-repo" :creds :gpg}]
                        ["snapshots" {:url "https://repo.wut.ee/repository/mikroskeem-repo" :creds :gpg}]]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [prismatic/hiphip "0.2.0"]]
  :jvm-opts ^:replace [])
