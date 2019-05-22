/*
32. Faça um programa que calcule e apresente o valor
do volume de uma lata de óleo,
utilizando a fórmula: volume = 3.14159 * R^2 * altura.
 */
package vale4pontos;

import javax.swing.JOptionPane;

public class VolumeLataDeOleo32 
{
    public static void main(String[] args)
    {
       double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio: "));
       double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
       
       double volume = (3.14159 * Math.pow(raio, 2)) * altura;
       
       JOptionPane.showMessageDialog(null, "O volume da lata de óleo é: " + volume);
    }
    
}
