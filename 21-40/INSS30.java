/*
Faça um programa que efetue o cálculo do salário líquido de um professor,
os valores fornecidos são: valor da hora aula,
número de aulas dadas no mês e percentual do INSS.
 */
package vale4pontos;

import javax.swing.JOptionPane;

public class INSS30 
{
    public static void main(String[] args) 
    {
        double valor_hora_aula = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora aula: "));
        double numero_aulas_no_mes = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de aulas no mês: "));
        double percentual_inss = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual do INSS: "));
        
        double salario_bruto = valor_hora_aula * numero_aulas_no_mes;
        double desconto_INSS = (percentual_inss * salario_bruto) / 100;
        double salario_liquido = salario_bruto - desconto_INSS;
        
        JOptionPane.showMessageDialog(null, "O salário líquido desse professor é de: " + salario_liquido);
    }
}

