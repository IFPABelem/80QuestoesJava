//10. Faça um programa que entre com 4 números e exiba na tela a média ponderada, sabendo que seus respectivos pesos são: 1, 2, 3, 4.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoDez
    {
        public static void main(String [] args)
        {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: ")); 
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo número: "));
        int n3=Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro número: "));
        int n4=Integer.parseInt(JOptionPane.showInputDialog("Digite o Quarto número: "));
        int mediaponderada=((1*n1)+(2*n2)+(3*n3)+(4*n4))/10; 
        JOptionPane.showMessageDialog(null,"Média ponderada: "+mediaponderada);
        }
    }