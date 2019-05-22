/*
35. Faça um programa que leia valores para as variáveis A e B, efetue a troca de
valores para que a variável A passe a ter o valor da variável B e vice versa,
apresente os valores trocados.
 */
package vale4pontos;

import javax.swing.JOptionPane;

public class TrocarValores35 
{
    public static void main(String[] args) 
    {
        double A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        double B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
        
        JOptionPane.showMessageDialog(null, "Valor de A antes: "
        + A + "\n" + "Valor de B antes: " + B);
        
        double C = B;
        B = A;
        A = C;
        
        JOptionPane.showMessageDialog(null, "Valor de A depois: "
        + A + "\n" + "Valor de B depois: " + B);
    }
}
