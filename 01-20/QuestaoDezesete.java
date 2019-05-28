/*17. Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo, faça um
programa que receba o valor de um salário mínimo e a quantidade de quilowatts gasta por uma
residência e exiba na tela: O valor em reais de cada quilowatt, o valor em reais a ser pago
e o novo valor a ser pago por essa residência com um desconto de 10%.*/
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoDezesete
    {
        public static void main(String [] args)
        {
        float Salario_Minimo=Float.parseFloat(JOptionPane.showInputDialog("Salario minimo atual:"));
        float Quilowatts=Float.parseFloat(JOptionPane.showInputDialog("Quilowatts gastos:"));
        
        float Valor_quilowatts=100/(Salario_Minimo/7);
        float Valor_a_serpago=Valor_quilowatts*Quilowatts;
        float Desconto=((Valor_quilowatts*Quilowatts)/100)*10;
        float Valor_a_ser_pago_com_desconto=(Valor_quilowatts*Quilowatts)-Desconto;
        
        JOptionPane.showMessageDialog(null,"Valor de cada Quilowatts: " + Valor_quilowatts + " Reais"
        + "\n" + "Valor a ser pago: " + Valor_a_ser_pago + " Reais"
        + "\n" + "Valor a ser pago com desconto de 10%: " + Valor_a_ser_pago_com_desconto + " Reais");
        }
    }
