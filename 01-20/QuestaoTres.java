//3. Faça um programa que leia um número inteiro e exiba na tela seu sucessor e seu antecessor.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoTres
    {
        public static void main(String [] args)
        {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: "));
        int ante=n-1;
        int suce=n+1;
        JOptionPane.showMessageDialog(null,"Antecessor: "+ante+"\n"+"Sucessor: "+suce);
        }
    }
