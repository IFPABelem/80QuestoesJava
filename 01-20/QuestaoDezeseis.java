/*16. Faça um programa que entre com um número no formato CDU e exiba na tela invertido:
UDC. Exiba na tela das duas maneiras em variáveis individuais.*/
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoDezeseis
    {
        public static void main(String [] args)
        {
        int Num=Integer.parseInt(JOptionPane.showInputDialog("Número de 3 Digitos:"));
        int N1=Num/100;
	int N2=Num%100/10;
	int N3=Num%10;
        int Numinvertido=N3*100+N2*10+N1;
        JOptionPane.showMessageDialog(null,"Número no formato original CDU: "+Num+"\n"+
        "Número no formato invertido UDC: "+Numinvertido);
        }
    }
