//5. Faça um programa que leia dois números inteiros e exiba na tela a soma. Antes do resultado exiba na tela a mensagem "Soma".
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoCinco
    {
        public static void main(String [] args)
        {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor inteiro: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor inteiro: "));
        int soma=a+b;
        JOptionPane.showMessageDialog(null,"Soma: "+soma);
        }
    }
