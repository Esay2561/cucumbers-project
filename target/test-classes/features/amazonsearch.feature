@urunarama
Feature: Amazon Arama
  Background: Oncesinde calisacak method (Before Method)
    Given kullanici amazon sayfasina gider
  @amazon
  Scenario: TC02 kullanici amazonda arama yapar
    And kullanici aramaKutusuna headphones yazar ve arama yapar
    Then kullanici sonuc sayisini ekrana yazdirir
  @amazoncamera
  Scenario: TC03 kullanici amazonda arama yapar
    And kullanici aramakutusuna camera yazar ve arar
    Then kullanici sonuc sayisini ekrana yazdirir
