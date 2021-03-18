Feature: Consulta

  Scenario: Consultar Ovo de Páscoa
    Given que acesso a Wikipedia em Portugues
    When pesquiso por "Ovo de Páscoa"
    Then exibe a expressao "Ovo de Páscoa" no titulo da guia
