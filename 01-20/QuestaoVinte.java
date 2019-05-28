//20. Faça um programa que entre com um raio de um círculo e exiba na tela: perímetro e área.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoVinte
    {
        public static void main(String [] args)
        {
        double pi=3.1415926;
        double raio=Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do cirulo em metros:"));
        double Perimetro=2*pi*raio;
        double Area=pi*(raio*raio);
        JOptionPane.showMessageDialog(null,"Perimetro do Circulo: "+Perimetro+" metros"+"\n"+
        "Área do Circulo: "+Area+" metros quadrados");
        }
    }