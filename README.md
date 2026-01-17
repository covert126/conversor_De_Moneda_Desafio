#  Conversor de Monedas en Java

## Descripción

Este proyecto es un **conversor de monedas en Java** que consume una **API externa de tasas de cambio en tiempo real**. Permite convertir montos entre diferentes divisas usando una interfaz por consola, aplicando buenas prácticas como consumo de API REST, uso de `record`, `Map`, `Scanner` y control de flujo con `switch`.

---

##  Funcionalidades

*  **Consumo de API externa** de tasas de cambio (ExchangeRate API).
*  **Conversión entre múltiples monedas**, entre ellas:

  * Peso Colombiano (COP)
  * Dólar Estadounidense (USD)
  * Peso Argentino (ARS)
  * Real Brasileño (BRL)
*  **Conversión dinámica**: el usuario puede ingresar cualquier moneda base y moneda destino.
*  **Menú interactivo por consola** usando `while` y `switch`.
*  **Ingreso de datos por teclado** con `Scanner`.
*  Uso de `Map<String, Double>` para manejar tasas de conversión.
*  Uso de `record` para mapear la respuesta JSON de la API.
*  Normalización de entrada (`toUpperCase`) para evitar errores por mayúsculas/minúsculas.
*  Opción para **salir del programa** desde el menú.

---

##  Estructura del proyecto

* **Principal**: contiene el menú, el `switch` y la interacción con el usuario.
* **Cambios**: se encarga de realizar la conexión con la API y obtener las tasas de cambio.
* **Divisas (record)**: representa la respuesta de la API (`base_code` y `conversion_rates`).
* **Conversiones**: contiene la lógica de conversión entre monedas, incluyendo un método genérico para cualquier divisa.

---

##  Tecnologías usadas





## Ejecución

1. Ejecuta la clase `Principal`.
2. Selecciona una opción del menú.
3. Ingresa la moneda base, moneda destino y el monto.
4. Visualiza el resultado de la conversión en consola.

---

