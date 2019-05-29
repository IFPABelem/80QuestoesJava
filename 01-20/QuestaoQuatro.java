//4. Faça um programa que leia nome, endereço e telefone e exiba na tela.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoQuatro
    {
        public static void main(String [] args)
        {
        String nome=JOptionPane.showInputDialog("Nome: ");
        String endereco=JOptionPane.showInputDialog("Endereço: ");
        String telefone=JOptionPane.showInputDialog("Telefone: ");
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n"+"Endereço: "+endereco+"\n"+
        "Telefone: "+telefone);
        }
    }
