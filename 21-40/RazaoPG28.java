/*
 28. Faça um programa que entre com a razão de uma PG e o valor do 1º termo.
Calcule e exiba na tela o 5º termo da série.
 */
package vale4pontos;

import javax.swing.JOptionPane;

/*
Fórmula: termo_desejado = primeiro_termo x (razão^posição_do_termo_desejado - 1)
*/

public class RazaoPG28
{
    public static void main(String[] args)
    {
        double razao = Double.parseDouble(JOptionPane.showInputDialog("Digite a razão da PG: "));
        double primeiro_termo = Double.parseDouble(JOptionPane.showInputDialog("Digite primeiro termo da PG: "));
        
        double quinto_termo = primeiro_termo * Math.pow(razao, (5 - 1));
        
        JOptionPane.showMessageDialog(null, "O quinto termo dessa PG é o: " + quinto_termo);
    }
}
