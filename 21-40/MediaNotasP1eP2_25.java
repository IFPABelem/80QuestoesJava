/*
25. Faça um programa que entre com notas P1 e P2
e exiba na tela a média final truncada e arredondada.
 */
package vale4pontos;

import javax.swing.JOptionPane;

public class MediaNotasP1eP2_25 
{
    public static void main(String[] args)
    {
        double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota P1: "));
        double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota P2: "));
        
        double media = (p1 + p2) / 2;
        double media_truncada = Math.ceil(media);    
        double medi_arredondada = Math.round(media);
        
        JOptionPane.showMessageDialog(null, "Nota 1: " + p1
        + "\n" + "Nota 2: " + p2
        + "\n" + "Média: " + media
        + "\n" + "Média arredondada: " + medi_arredondada
        + "\n" + "Média truncada: " + (media_truncada - 1));
    }
}
        