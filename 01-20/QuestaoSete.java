//7. Faça um programa que leia um número real e exiba na tela a sua terça parte.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoSete
    {
        public static void main(String [] args)
        {
        float num=Float.parseFloat(JOptionPane.showInputDialog("Digite um número real: "));
        float tercaparte=num/3;
        JOptionPane.showMessageDialog(null,"A terceira parte do número real "+num+" é = "+tercaparte);
        }
    }