package javaapplication3.Monedas;
import javax.swing.JOptionPane;

public class FuncionMonedas {
        
                public void pesoDolar(double valor) {
                    
                  double    PesDol= (valor * 0.0012);
                      
                      JOptionPane.showMessageDialog(null,"ha convertido con exito "+valor+" pesos en "+PesDol+" Dolares");
                                                            
                }

                public void pesoEuro(double valor) {
                 double   PesEur= valor * 0.0011;
                    JOptionPane.showMessageDialog(null,"convertido con exito "+valor+" pesos en "+PesEur+" euros");
                }

                public void pesoLibra(double valor) {
                  double  PesLibr= valor * 0.00093;
                    
                    JOptionPane.showMessageDialog(null, "convertido con exito "+valor+" pesos en "+PesLibr+" libras esterlinas");                    
                }

                public void pesoYen(double valor) {
                   double PesYen= valor * 0.17;
                    JOptionPane.showMessageDialog(null,"convertido con exito "+valor+" pesos en "+PesYen+" Yenes Japoneses");
                }

                public void pesoWon(double valor) {
                    double PesWon= valor * 1.54;
                    
                    JOptionPane.showMessageDialog(null,"convertido con exito "+valor+" pesos en "+PesWon+" won Surcoreanos");
                }

                public void DolarPeso(double valor) {
                  double DolPes = valor * 828.16;
                   JOptionPane.showMessageDialog(null,"convertido con exito "+valor+" Dolares en "+DolPes+" pesos Chilenos");
                }

                public void EuroPeso(double valor) {
                  double EurPes= valor * 919.09;
                  
                  JOptionPane.showMessageDialog(null,"convertido con exito "+valor+" Euros en "+EurPes+" Pesos Chilenos");
                }

                public void libraPes(double valor) {
                    double EurPes=  valor * 1069.88;
                    
                    JOptionPane.showMessageDialog(null, "convertido con exito "+valor+" Libras Esterlinas en "+EurPes+" Pesos Chilenos");
                }

                public void yenPesp(double valor) {
                    double YenPes= valor * 5.9;
                    JOptionPane.showMessageDialog(null,"convertido con exito "+valor+" Yenes Japoneses en "+YenPes+" Pesos Chilenos");
                }

                public void WonPeso(double valor) {
                    double WonPes= valor * 0.65;
                    JOptionPane.showMessageDialog(null,"convertido con exito "+valor+" Wons Surcoreanos  en "+WonPes+" Pesos Chilenos");
                     
                }
                
}