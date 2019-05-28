//15. Faça um programa que entre com o saldo de uma aplicação e exiba na tela um novo saldo, considerando um reajuste de 1%.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoQuinze
    {
        public static void main(String [] args)
        {
        float Saldo=Float.parseFloat(JOptionPane.showInputDialog("Digite o Saldo:"));
        float Reajuste=Saldo/100;
        float Saldocomreajuste=Saldo+Reajuste;
        JOptionPane.showMessageDialog(null,"Saldo com reajuste de 1%: "+Saldocomreajuste);
        }
    }