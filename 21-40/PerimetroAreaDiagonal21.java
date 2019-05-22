/*
21. Faça um programa que entre com um lado de um quadrado
e exiba na tela: perímetro, área e diagonal.
 */
package vale4pontos;

import javax.swing.JOptionPane;

/*
Fórmula: diagonal^2 = lado^2 + lado^2
*/

public class PerimetroAreaDiagonal21
{
    public static void main(String[] args)
    {
        double lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado do quadrado: "));
        
        double perimetro = lado * 4;
        double area = lado * lado;
        double soma_quadrados_catetos = 2 * area;
        double diagonal = Math.sqrt(soma_quadrados_catetos);
        
        JOptionPane.showMessageDialog(null, "Perimetro: " + perimetro + 
        "\n" + "Área: " + area +
        "\n" + "Diagonal: " + diagonal);
    }
}
