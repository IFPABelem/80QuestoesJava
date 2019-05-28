//14. Faça um programa que entre com um número e exiba na tela: número, quadrado e raiz quadrada.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoQuatorze
    {
        public static void main(String [] args)
        {
        float Num=Float.parseFloat(JOptionPane.showInputDialog("Digite um número:"));
        float Quadrado=Num*Num;
        double Raiz=Math.sqrt(Num);
        JOptionPane.showMessageDialog(null,"Número Digitado: "+Num+"\n"+
        "Quadrado do Número Digitado: "+Quadrado+"\n"+"Raiz Quadrada do Número Digitado: "+Raiz);
        }
    }