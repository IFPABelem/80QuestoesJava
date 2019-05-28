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
        float SalarioMinimo=Float.parseFloat(JOptionPane.showInputDialog("Salario minimo atual:"));
        float Quilowatts=Float.parseFloat(JOptionPane.showInputDialog("Quilowatts gastos:"));
        float Valorquilowatts=100/(SalarioMinimo/7);
        float Valoraserpago=Valorquilowatts*Quilowatts;
        float Desconto=((Valorquilowatts*Quilowatts)/100)*15;
        float Valoraserpagocomdesconto=(Valorquilowatts*Quilowatts)-Desconto;
        JOptionPane.showMessageDialog(null,"Valor de cada Quilowatts: "+Valorquilowatts+" Reais");
        JOptionPane.showMessageDialog(null,"Valor a ser pago: " + Valoraserpago+" Reais");
        JOptionPane.showMessageDialog(null,"Valor a ser pago com desconto de 10%: "+Valoraserpagocomdesconto+" Reais");
        }
    }