/*13. Faça um programa que entre com o número e a base em que se deseja calcular o log e o exiba
na tela.*/
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoTreze
    {
        public static void main(String [] args)
        {
        double Num=Double.parseDouble(JOptionPane.showInputDialog("Digite um Número:"));
        double Base=Double.parseDouble(JOptionPane.showInputDialog("Digite a Base:"));
        double Resultado=Math.log(Num)/Math.log(Base);
        JOptionPane.showMessageDialog(null, "Resultado do log de "+Num+" na base "+Base+
        " é igual a "+Resultado);
        }
    }
