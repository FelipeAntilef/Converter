package javaapplication3;

import javax.swing.JOptionPane;
import javaapplication3.Monedas.ConversorMonedas;
import javaapplication3.Temperatura.ConversorTemperatura;

public class Main_Conversor {

    public static void main(String[] args) {

        ConversorMonedas mainMonedas = new ConversorMonedas();
        ConversorTemperatura mainTemper = new ConversorTemperatura();

        while (true) {

            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione qué convertidor desea utilizar",
                    "Alura", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Divisas", "Conversor de Temperaturas"},
                    "Conversor de Divisas");

            if (opcion == null || opcion.equals("Cancelar")) {
                JOptionPane.showMessageDialog(null, "Cerrando programa", "Alura", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            switch (opcion) {
                case "Conversor de Divisas":
                    mainMonedas.ConversorMon();
                    break;
                case "Conversor de Temperaturas":
                    mainTemper.conversiontem();
                    break;
            }
        }
    }
}