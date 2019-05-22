/*
 22. Faça um programa que entre com os lados a, b, c de um paralelepípedo.
Calcule e exiba na tela a diagonal.
 */
package vale4pontos;

import javax.swing.JOptionPane;

/*
Fórmula: diagonal^2 = comprimento^2 + largura^2 + altura^2
*/

public class DiagonalParalelepipedo22 
{
    public static void main(String[] args) 
    {
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do comprimento: "));
        double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da largura: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
        
        double soma_dos_quadrados = (comprimento * comprimento) + (largura * largura) + (altura * altura);
        double diagonal = Math.sqrt(soma_dos_quadrados);
        
        JOptionPane.showMessageDialog(null, "Diagonal do paralelepídepo: " + diagonal);
    }
}
