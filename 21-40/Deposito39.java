/*
39. Faça um programa que leia o valor de um deposito
e o valor de taxa de juros. Calcule e exiba na tela
o valor do rendimento e o valor depois do rendimento.
*/
package vale4pontos;

import javax.swing.JOptionPane;

/*
Fórmula: rendimento = deposito * (juros / 100)
         valor_final = rendimento + deposito
*/

public class Deposito39 
{
    public static void main(String[] args)
    {
        double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
        double juros = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da taxa de juros mensal: " + "%"));
        
        double valor_final = (deposito * (juros / 100)) + deposito;
        double valor_do_rendimento = valor_final - deposito;
            
        JOptionPane.showMessageDialog(null, "Deposito: " + deposito
        + "\n" + "Valor do rendimento: " + valor_do_rendimento
        + "\n" + "Valor total: " + valor_final);
    }
}
