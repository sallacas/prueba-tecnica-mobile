# Proyecto de Automatización Web con Screenplay

Este es un proyecto de automatización mobile desarrollado utilizando el patrón **Screenplay** en **Java 17** y gestionado con **Gradle 8+**. El propósito de este proyecto es automatizar operaciones de una aplicacion de calculadora

## Requisitos

- **Java 17**
- **Gradle 8+**
- Appium 2.11.3
- Dispositivo Android 11 emulado
- Un IDE compatible como **IntelliJ IDEA** o **Eclipse** (opcional)
- Acceso a internet para la ejecución de pruebas contra los servicios o aplicaciones web


## Ejecución de las Pruebas

### Ejecutar Todas las Pruebas

Para ejecutar todas las pruebas del proyecto, puedes utilizar el siguiente comando en la raíz del proyecto:

```bash
./gradlew clean test
```

### Ejecutar Pruebas por Tag

Si deseas ejecutar un escenario específico usando su Tag, puedes hacerlo utilizando la opción -Dtags, como se muestra a continuación:

Para ejecutar el escenario de las operaciones de la calculadora (@Calculator):

```bash
./gradlew clean test -Dtags=@Calculator
```


## Generación de Reportes

Después de la ejecución de las pruebas, puedes generar reportes utilizando el siguiente comando:

```bash
./gradlew reports
```

Esto generará un reporte detallado sobre las pruebas ejecutadas, sus resultados, y las métricas asociadas.

## Tecnologías Utilizadas
- Serenity BDD: Para la gestión de pruebas con el patrón Screenplay.
- Java 17: Lenguaje de programación utilizado en el proyecto.
- Gradle 8+: Herramienta de construcción utilizada para la ejecución y gestión de dependencias.
- Selenium WebDriver: Para la interacción con la aplicación web.
- JUnit: Framework de pruebas utilizado como base para la ejecución de las pruebas.

## Contacto
Si tienes alguna pregunta o sugerencia, no dudes en ponerte en contacto con nosotros. ¡Estaremos encantados de ayudarte!