/*
40. Faça um programa que receba um número real, calcule e exiba na tela:
a parte inteira do número, a parte fracionaria do número e o número arredondado
 */
package vale4pontos;

import javax.swing.JOptionPane;

public class NumeroReal40 
{
    public static void main(String[] args)
    {
        float numero = Float.parseFloat(JOptionPane.showInputDialog("Digite o número real: "));
        
        int inteira = (int) numero;
        double fracionaria = numero - inteira;
        double arredondado = Math.round(numero);
        
        JOptionPane.showMessageDialog(null, "Número: " + numero
        + "\n" + "parte inteira: " + inteira
        + "\n" + "Parte fracionária: " + fracionaria
        + "\n" + "Arredondada: " + arredondado);
    }
}
