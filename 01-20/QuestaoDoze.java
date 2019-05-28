//12. Faça um programa que entre com um número e exiba na tela o log desse número na base 10.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoDoze
    {
        public static void main(String [] args)
        {
        double Num=Float.parseFloat(JOptionPane.showInputDialog("Digite um Número:"));
        double Resultado=Math.log10(Num);
        JOptionPane.showMessageDialog(null,"Resultado do log de "+Num+" na base decimal "+Resultado);
        }
    }