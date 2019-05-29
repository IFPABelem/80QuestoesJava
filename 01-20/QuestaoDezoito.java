/*18. Faça um programa que entre com um nome e exiba na tela: nome completo, primeiro caractere
último caractere, do primeiro ao terceiro caractere, quarto caractere, todos menos o primeiro e
os dois últimos.*/
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoDezoito
    {
        public static void main(String[] args)
        {
        String Nome = JOptionPane.showInputDialog("Nome: ");
        JOptionPane.showMessageDialog(null,"Nome Completo: "+Nome+"\n"+
        "Primeiro caractere: "+Nome.charAt(0)+"\n"+"Último caractere: "+Nome.charAt(Nome.length()-1)+"\n"+
        "Do primeiro ao terceiro caractere: "+Nome.substring(0,3)+"\n"+"Quarto caractere: "+Nome.charAt(3)+"\n"+
        "Todos menos o primeiro e os dois últimos: "+Nome.substring(1,Nome.length()-2));
        }
    }
