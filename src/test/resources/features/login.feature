Feature: Login en la app movil

  Scenario: Login exitoso con credenciales validas
    Given Lucia abre la app de login
    When ella ingresa el usuario "admin" y la contrasena "123456"
    And ella presion el boton ingresar
    Then ella deberia ver la pantalla principal

