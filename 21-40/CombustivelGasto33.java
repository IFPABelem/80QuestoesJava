/*
33. Faça um programa que efetue o cálculo da quantidade de litros de combustível
gastos em uma viagem, sabendo-se que o carro faz 12km/L. Deverão ser fornecidos
o tempo gasto na viagem e a velocidade média.
Utilize, distancia = tempo * velocidade; litros usados = distancia / 12.
 */
package vale4pontos;

import javax.swing.JOptionPane;

public class CombustivelGasto33 
{
    public static void main(String[] args)
    {
        double tempo_horas = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo em horas: ")); 
        double velocidade_media = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media: "));
        
        double distancia = tempo_horas * velocidade_media;
        double combustivel_gasto = distancia / 12;
        
        JOptionPane.showMessageDialog(null, "Foram gastos " + combustivel_gasto + " litros");
    }
}
