//1. Faça um programa que exiba na tela a média aritmética entre os números 8, 9 e 7.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoUm
    {
        public static void main(String [] args)
        {
        int a=8, b=9, c=7, media;
        media=(a+b+c)/3;
        JOptionPane.showMessageDialog(null,"Média entre 8, 9 e 7 é = "+media);
        }
    }
