Feature: Prueba de la calculadora

  @Calculator
  Scenario Outline: Realizar una operacion con dos numeros
    Given el ingreso a la calculadora
    When los numeros "<numero1>" y "<numero2>" quieren hacer la operacion "<operacion>"
    Then el resultado debe ser "<resultado>"
    Examples:
      | numero1 | numero2 | operacion   | resultado |
      ##@externaldata@src/test/resources/datadriven/prueba.xlsx@Info
   |18   |5   |SUMAR   |23|
   |95   |33   |RESTAR   |62|
   |12   |10   |MULTIPLICAR   |120|
   |950   |10   |DIVIDIR   |95|
