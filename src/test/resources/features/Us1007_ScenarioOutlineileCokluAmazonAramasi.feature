Feature: US1007 Amazonda coklu arama

  Scenario Outline: TC11 Kullanici Amazon'da coklu arama yapabilmeli



    Given Kullanici "amazonUrl" anasayfaya gider
    When "<aranacakUrun>" icin arama yapar
    Then Arama sonuclarinin "<aranacakUrun>" icerdigini test eder
    And Sayfayi kapatir


    Examples:
      | aranacakUrun |
      | Java         |
      | Phyton       |
      | Cucumber     |
      | Apple        |