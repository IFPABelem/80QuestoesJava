//19. Faça um programa que entre com a base e altura de um retângulo e exiba na tela: perímetro, área e a diagonal.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoDezenove
    {
        public static void main(String [] args)
        {
        double Base=Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retângulo em metros:"));
        double Altura=Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo em metros:"));
        double Perimetro=2*(Base+Altura);
        double Area=Base*Altura;
        double X=((Base*Base)+(Altura*Altura));
        double Diagonal=Math.sqrt(X);
        JOptionPane.showMessageDialog(null, "Perimetro do retângulo: "+Perimetro+" metros"+"\n"+
        "Área do retângulo: "+Area+" metros quadrados"+"\n"+
        "Diagonal do retângulo: "+Diagonal+" metros quadrados");
        }
    }