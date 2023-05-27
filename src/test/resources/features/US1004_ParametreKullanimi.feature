Feature: US1004 Steplerde parametre kullanilabilmeli


  Scenario: TC07 Amazon Nutella Testi

    Given Kullanici "amazonUrl" anasayfaya gider
    When "Nutella" icin arama yapar
    Then Arama sonuclarinin "Nutella" icerdigini test eder
    And 3 saniye bekler
    And Sayfayi kapatir

@ss
  Scenario: TC08 Amazon Java Testi

    Given Kullanici "amazonUrl" anasayfaya gider
    When "Java" icin arama yapar
    Then Arama sonuclarinin "Java" icerdigini test eder
    And Sayfayi kapatir