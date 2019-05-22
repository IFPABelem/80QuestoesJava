/*
 31. Faça um programa que leia a temperatura em graus célsius
e apresente-as em Fahrenheit. F = (9C +160) / 5. C = Celsius; F = Fahrenheit.
 */
package vale4pontos;

import javax.swing.JOptionPane;

/*
Fórmula: (celsius x 1.8) + 32 
*/

public class CelsiusFahren31 
{
    public static void main(String[] args)
    {
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius: "));
        
        double fahrenheit = (celsius * 1.8) + 32;
        
        JOptionPane.showMessageDialog(null, celsius + " em Fahrenheit: " + fahrenheit);
    }
}

