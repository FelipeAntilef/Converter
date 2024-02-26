package javaapplication3.Monedas;

import javax.swing.JOptionPane;

public class ConversorMonedas {

    FuncionMonedas monedas = new FuncionMonedas();

    public void ConversorMon() {

        while (true) {
            String opcion = (String) JOptionPane.showInputDialog(null, "Conversor de Monedas", "Monedas", JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"De Pesos Chilenos a Dólares", "De Pesos Chilenos a Euros", "De Pesos Chilenos a Libras Esterlinas", "De Pesos Chilenos a Yenes Japoneses",
                            "De Pesos Chilenos a Won SurCoreanos", "De Dólar a Pesos Chilenos", "De Euro a Pesos Chilenos", "De Libras Esterlinas a Pesos Chilenos",
                            "De Yen a Pesos Chilenos", "De Won SurCoreano a Pesos Chilenos", "Salir"},
                    "De Pesos Chilenos a Dólares");

            if (opcion == null || opcion.equals("Salir")) {
               
                break;
            }

            String inputMonedasSt = JOptionPane.showInputDialog(null, "Ingrese Cantidad de Dinero a Convertir");

          
            if (esNumeroDecimalValido(inputMonedasSt)) {
                double inputMonedas = Double.parseDouble(inputMonedasSt);

                switch (opcion) {
                    case "De Pesos Chilenos a Dólares":
                        monedas.pesoDolar(inputMonedas);
                        break;
                    case "De Pesos Chilenos a Euros":
                        monedas.pesoEuro(inputMonedas);
                        break;
                    case "De Pesos Chilenos a Libras Esterlinas":
                        monedas.pesoLibra(inputMonedas);
                        break;
                    case "De Pesos Chilenos a Yenes Japoneses":
                        monedas.pesoYen(inputMonedas);
                        break;
                    case "De Pesos Chilenos a Won SurCoreanos":
                        monedas.pesoWon(inputMonedas);
                        break;
                    case "De Dólar a Pesos Chilenos":
                        monedas.DolarPeso(inputMonedas);
                        break;
                    case "De Euro a Pesos Chilenos":
                        monedas.EuroPeso(inputMonedas);
                        break;
                    case "De Libras Esterlinas a Pesos Chilenos":
                        monedas.libraPes(inputMonedas);
                        break;
                    case "De Yen a Pesos Chilenos":
                        monedas.yenPesp(inputMonedas);
                        break;
                    case "De Won SurCoreano a Pesos Chilenos":
                        monedas.WonPeso(inputMonedas);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Entrada inválida. ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
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
