//6. Faça um programa que leia dois números inteiros e exiba na tela seu produto.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoSeis
    {
        public static void main(String [] args)
        {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor inteiro: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Segundo valor inteiro: "));
        int produto=a*b;
        JOptionPane.showMessageDialog(null,"Produto: "+produto);
        }
    }