/*
34. Faça um programa que efetue o cálculo do valor de uma prestação em atraso,
utilizando: prestação = valor + (valor * (taxa / 100) * tempo).
 */
package vale4pontos;

import javax.swing.JOptionPane;

public class PrestacaoAtrasada34 
{
    public static void main(String[] args) 
    {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
        double taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite taxa de juros: " + "%"));
        double tempo_meses = Double.parseDouble(JOptionPane.showInputDialog("Tempo em meses: "));
        
        double prestacao = valor + (valor * (taxa / 100) * tempo_meses);
        
        JOptionPane.showMessageDialog(null, "Valor: " + valor
        + "\n" + "Taxa: " + taxa + "%"
        + "\n" + "Tempo em meses: " + tempo_meses
        + "\n" + "Valor da prestação: " + prestacao);
    }
}
