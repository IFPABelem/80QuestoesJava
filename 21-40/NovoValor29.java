/*
29. Faça um programa que possa entrar com o valor de um produto
e exiba na tela o novo valor tendo em vista que o desconto de 9%.
 */
package vale4pontos;

import javax.swing.JOptionPane;

public class NovoValor29 
{
    public static void main(String[] args)
    {
        double valor_do_produto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
        
        double desconto = (valor_do_produto * 9) / 100;
        double valor_com_desconto = valor_do_produto - desconto;
        
        JOptionPane.showMessageDialog(null, "Valor com os 9% de desconto: " + valor_com_desconto);
    }
}
