(ns {{namespace}}
  (:require {{component-ns}}))

(defprotocol {{protocol}}
  ;; boundary definition
  )

(extend-protocol {{protocol}}
  {{component-ns}}.{{component}}
  ;; boundary implementation
  )
