/*
 26. Faça um programa que entre com os valores
dos catetos de um triangulo retângulo e exiba na tela a sua hipotenusa.
 */
package vale4pontos;

import javax.swing.JOptionPane;

/*
Fórmula: hipotenusa^2 = catetoA^2 + catetoB^2
*/

public class HipotenusaTriangulo26 
{
    public static void main(String[] args)
    {
        double catetoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto A: "));
        double catetoB = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto B: "));
        
        double soma_dos_quadrados = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);
        double hipotenusa = Math.sqrt(soma_dos_quadrados);
        
        JOptionPane.showMessageDialog(null, "Hipotenusa: " + hipotenusa);
    }
}
