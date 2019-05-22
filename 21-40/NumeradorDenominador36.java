/*
36. Faça um programa que leia o numerador e o denominador de uma fração
e transforme-a em um número decimal.
*/
package vale4pontos;

import javax.swing.JOptionPane;

public class NumeradorDenominador36 
{
    public static void main(String[] args) 
    {
        double numerador = Integer.parseInt(JOptionPane.showInputDialog("Digite o numerador: "));
        double denominador = Integer.parseInt(JOptionPane.showInputDialog("Digite o denominador: "));
        
        double decimal = numerador / denominador;
        
        JOptionPane.showMessageDialog(null, "Decimal: " + decimal);
    }
}
