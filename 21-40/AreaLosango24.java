/*
24. Faça um programa que calcule e exiba na tela a área de um losango.
 */
package vale4pontos;

import javax.swing.JOptionPane;

/*
Fórmula: área = (diagonal_maior x diagonal_menor) / 2 
*/

public class AreaLosango24 
{
    public static void main(String[] args)
    {
        double diagonal_maior = Double.parseDouble(JOptionPane.showInputDialog("Digite a diagonal maior: "));
        double diagonal_menor = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da diagonal menor: "));
        
        double area =(diagonal_maior * diagonal_menor) / 2;
        
        JOptionPane.showMessageDialog(null, "Área do losango: " + area);
    }
}
