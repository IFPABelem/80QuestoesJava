/*
27. Faça um programa que entre com a razão de uma PA e o valor do 1º termo.
Calcule e exiba na tela o 10º termo da série.
 */
package vale4pontos;

import javax.swing.JOptionPane;

/*
Fórmula: termo_desejado = primeiro_termo + ((posição_do_termo_desejado - 1) x razão)
*/

public class RazaoPA27 
{
    public static void main(String[] args)
    {
        double razao = Double.parseDouble(JOptionPane.showInputDialog("Digite a razão da PA: "));
        double primeiro_termo = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro termo: "));
        
        double decimo_termo = primeiro_termo + ((10 - 1) * razao);
        
        JOptionPane.showMessageDialog(null, "O décimo termo dessa PA é o: " + decimo_termo);
    }         
}
