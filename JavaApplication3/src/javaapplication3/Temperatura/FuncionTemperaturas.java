package javaapplication3.Temperatura;

import javax.swing.JOptionPane;

public class FuncionTemperaturas {
	
	public void CelFare(double valor) {
		double CFare= ((valor * 1.8) +32);
                                JOptionPane.showMessageDialog(null,"has convertido con exito "+valor+" Grados Celcius en "+CFare+"Grados Farenheig");                                
	}
	
	public void celKelvin(double valor) {
		
		double CKel= valor + 273.15;
                                     JOptionPane.showMessageDialog(null,"has convertido con exito "+valor+" grados Celcius en "+CKel+" grados Kelvin");
	}
	
	public void FareCel(double valor) {
		double FCel=((valor - 32) * 0.555);
                                    JOptionPane.showMessageDialog(null,"has convertido con exito "+ valor+ "grados Farenheig a "+FCel+" grados Celcius");
	}
	
	public void KelCel(double valor) {
		double KCel= (valor-273.15);
                                    JOptionPane.showMessageDialog(null,"has convertido con exito "+valor+" Grados Kelvin a "+KCel+" grados Celcius");
	}
}
