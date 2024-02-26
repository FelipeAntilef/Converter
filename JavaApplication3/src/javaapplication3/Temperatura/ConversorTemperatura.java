package javaapplication3.Temperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

    FuncionTemperaturas temperatura = new FuncionTemperaturas();

    public void conversiontem() {
        while (true) {
            String opcion = (String) JOptionPane.showInputDialog(null, "Elige qué unidades convertirás",
                    "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                            "Grados Celsius a Fahrenheit",  "Grados Celsius a Kelvin", "Grados Fahrenheit a Celsius", "Grados Kelvin a Celsius" }, "Grados Celsius a Fahrenheit");

            if (opcion == null || opcion.equals("Cancelar")) {
                
                break;
            }

            String inputTemperaturaSt = JOptionPane.showInputDialog(null, "Ingrese los Grados a convertir");

           
            if (esNumeroDecimalValido(inputTemperaturaSt)) {
                double inputTemperatura = Double.parseDouble(inputTemperaturaSt);

                switch (opcion) {
                    case "Grados Celsius a Fahrenheit":
                        temperatura.CelFare(inputTemperatura);
                        break;

                    case "Grados Celsius a Kelvin":
                        temperatura.celKelvin(inputTemperatura);
                        break;

                    case "Grados Fahrenheit a Celsius":
                        temperatura.FareCel(inputTemperatura);
                        break;

                    case "Grados Kelvin a Celsius":
                        temperatura.KelCel(inputTemperatura);
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Entrada inválida, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private boolean esNumeroDecimalValido(String numero) {
        try {
            Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
