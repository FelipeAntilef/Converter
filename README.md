# Conversor de Monedas

Este es un simple conversor de monedas en Java que utiliza la interfaz gráfica JOptionPane para la interacción con el usuario.

## Funcionalidades

- Conversión entre diferentes monedas: Dólares, Euros, Libras Esterlinas, Yenes Japoneses, Wons Surcoreanos.
- Soporte para conversiones de y hacia pesos chilenos.

## Estructura del Proyecto

El proyecto está dividido en tres clases principales:

1. **ConversorMonedas:** Contiene las funciones estáticas para realizar las conversiones de monedas.

2. **Main_Conversor:** La clase principal que inicia la aplicación y gestiona la interfaz de usuario mediante JOptionPane.

3. **FuncionMonedas:** Una clase adicional que encapsula las funciones de conversión y muestra mensajes de resultado.

## Cómo Utilizar

1. Ejecuta la aplicación.
2. Selecciona el tipo de conversión que deseas realizar: "Conversor de Divisas" o "Conversor de Temperaturas".
3. Sigue las instrucciones para ingresar el valor a convertir.
4. La aplicación mostrará el resultado de la conversión.

## Ejemplo de Uso

```java
// Ejemplo de conversión de pesos a dólares
double valorEnPesos = 1000.0;
double resultado = Convercionesmonedas.pesoDolar(valorEnPesos);
System.out.println(valorEnPesos + " pesos chilenos equivalen a " + resultado + " dólares.");
