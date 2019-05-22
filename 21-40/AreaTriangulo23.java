/*
23. Faça um programa que calcule
e exiba na tela a área de um triangulo.
 */
package vale4pontos;

import javax.swing.JOptionPane;

/*
Fórmula: área = (base x altura) / 2
*/

public class AreaTriangulo23
{
    public static void main(String[] args)
    {
       double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base: "));
       double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
       
       double area = (base * altura)/2;
       
       JOptionPane.showMessageDialog(null, "Área do triangulo:" + area);
    }
}
