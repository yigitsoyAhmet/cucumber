Feature: US1003 BackGround kullanarak tekrarlardan kurtulur

  Background: Amazon anasayfaya gitme
    Given Kullanici Amazon anasayfaya gider

  Scenario: TC04 Amazon Nutella Testi


    When Nutella icin arama yapar
    Then Arama sonuclarinin Nutella icerdigini test eder
    And Sayfayi kapatir


  Scenario: TC05 Amazon Java Testi


    When Java icin arama yapar
    Then Arama sonuclarinin Java icerdigini test eder
    And Sayfayi kapatir
