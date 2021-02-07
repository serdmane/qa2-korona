Feature: Weather AIP

  Scenario: Testing city coordinates
    Given city id: 524901

    When we are requesting weather data

    Then lon is: 145.77
    And lat is: -16.92

    And weather id is: 802
    And weather main is: "Clouds"
    And weather description is: "scattered clouds"
    And weather icon is: "03n"
    And base is: "stations"

#    And temp is: 300.15
#    And pressure is: 1007
#    And humidity is: 74
#    And temp_min is: 300.15
#    And temp_max is: 300.15

    And main data is:
      | temp     | 300.15 |
      | pressure | 1007   |
      | humidity | 74     |
      | temp_min | 300.15 |
      | temp_max | 300.15 |

    And visibility is: 10000

    And wind data is:
      | speed | 3.6 |
      | deg   | 160 |

    And clouds data is:
      | all | 40 |

    And dt is: 1485790200

    And sys data is:
      | type    | 1          |
      | id      | 8166       |
      | message | 0.2064     |
      | country | AU         |
      | sunrise | 1485766550 |
      | sunset  | 1485766550 |

    And id is: 2172797
    And name is: "Cairns"
    And cod is: 200












