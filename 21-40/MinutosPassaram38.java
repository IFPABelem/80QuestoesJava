/*
38. Faça um programa que leia um valor de hora
informe quantos minutos se passaram desde o início do dia.
 */
package vale4pontos;

import javax.swing.JOptionPane;

public class MinutosPassaram38
{
    public static void main(String[] args)
    {
        double hora_do_dia = Double.parseDouble(JOptionPane.showInputDialog("Digite a hora sem os minutos: "));
        double minutos_do_dia = Double.parseDouble(JOptionPane.showInputDialog("Digite os minutos: "));
        
        double minutos_da_hora = hora_do_dia * 60;
        
        JOptionPane.showMessageDialog(null, "Se passaram " + (minutos_da_hora + minutos_do_dia) + " minutos");
    }
}
