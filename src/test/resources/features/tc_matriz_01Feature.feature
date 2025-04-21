Feature: Validación de Matriz

  Scenario: Validar la generación y contenido de la matriz
    Given el sistema ha generado una matriz
    When verifico el contenido de la matriz
    Then el contenido de la matriz es correcto