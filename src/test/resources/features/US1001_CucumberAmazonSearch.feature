Feature: 1001_Cucumber Amazon Search Test

  Scenario: TC01 Amazon Nutella Testi

    Given Kullanici Amazon anasayfaya gider
    When Nutella icin arama yapar
    Then Arama sonuclarinin Nutella icerdigini test eder
    And Sayfayi kapatir


  Scenario: TC02 Amazon Java Testi

    Given Kullanici Amazon anasayfaya gider
    When Java icin arama yapar
    Then Arama sonuclarinin Java icerdigini test eder
    And Sayfayi kapatir

