//2. Faça um programa que leia dois números inteiros e os exiba na tela.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoDois
    {
        public static void main(String [] args)
        {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
        JOptionPane.showMessageDialog(null,"Os números digitados são: "+a+" e "+b);
        }
    }
