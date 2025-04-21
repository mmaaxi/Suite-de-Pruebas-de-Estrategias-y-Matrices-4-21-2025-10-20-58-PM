Feature: Validación de Estrategia

  Scenario: Definir e implementar una estrategia
    Given El usuario está en la página de estrategia
    When El usuario define la estrategia
    Then La estrategia se define exitosamente
    
    When El usuario implementa la estrategia
    Then La estrategia se implementa correctamente