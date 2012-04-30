(ns c2.geo.t-core
  (:use midje.sweet
        c2.geo.core))

(def geojson {:type "MultiPolygon", :coordinates [[[[-89.54221,41.90248],[-89.53985,41.90259],[-89.53815,41.90271],[-89.53576,41.90268],[-89.5139,41.90227],[-89.6298,41.90175],[-89.58124,41.90213],[-89.57225,41.90217],[-89.56239,41.90222],[-89.54221,41.90248]]]]})

(fact "geojson should convert to svg string"
  (geo->svg geojson) => "M-89.54221,41.90248L-89.53985,41.90259L-89.53815,41.90271L-89.53576,41.90268L-89.5139,41.90227L-89.6298,41.90175L-89.58124,41.90213L-89.57225,41.90217L-89.56239,41.90222L-89.54221,41.90248Z")