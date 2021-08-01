Feature: Login pagina e-commerce Your Store
  Como usuario de compra necesito loguearme en la pagina Your Store

  Scenario: Iniciar sesion en pagina Your Store
    Given El usuario existe en la pagina Your Store
    When Hace click en la opcion My Account en el navbar
    And Selecciona la opcion Login e ingresa sus credenciales
    Then Se inicia sesion correctamente
