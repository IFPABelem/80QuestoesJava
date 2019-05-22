/*
37. Faça um programa que leia o valor
gasto com despesas realizadas em um
restaurante e exiba na tela o valor total com a gorjeta (10%).
*/
package vale4pontos;

import javax.swing.JOptionPane;

public class Gorjeta37
{
    public static void main(String[] args)
    {
        double conta_sem_gorjeta = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da conta: "));
        
        double valor_da_gorjeta = (conta_sem_gorjeta * 10) / 100;
        double valor_com_gorjeta = conta_sem_gorjeta + valor_da_gorjeta;
        
        JOptionPane.showMessageDialog(null, "Total a pagar: " + valor_com_gorjeta);
    }
}
