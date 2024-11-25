# Autor: Alejandro Almentero

  @Login
  Feature: Loguearse en el sistema

    Background:
      Given el usuario ingresa a la pagina de login
      When ingresa su nombre de usuario "qap4120@gmail.com" y contraseña "pruebasqa2024"

      Scenario Outline: enviar email
        Then el usuario envia un email
        |destinatario   |asunto    |descripcion |
        | <destinatario>| <asunto> |<descripcion>|

        Examples:
          |destinatario   |asunto    |descripcion |
          |pruebautomatizacionquipux@gmail.com| Automatización |Email de prueba|





