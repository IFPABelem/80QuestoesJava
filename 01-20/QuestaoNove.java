//9. Faça um programa que entre com dois números inteiros e exiba na tela a seguintes saída: dividendo, divisor, quociente e resto.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoNove
    {
        public static void main(String [] args)
        {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
        JOptionPane.showMessageDialog(null,"Dividendo: "+a+"\n"+"Divisor: "+b+"\n"+"Quociente: "+(a/b)+
        "\n"+"Resto: "+(a%b));
        }
    }