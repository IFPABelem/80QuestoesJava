/*11. Faça um programa que entre com um angulo em graus e exiba na tela: seno, co-seno, tangente,
secante, co-secante e co-tangente do mesmo.*/
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoOnze
    {
        public static void main(String [] args)
        {
        double angulo=Double.parseDouble(JOptionPane.showInputDialog("Digite o Angulo:"));
        
        double angulo_em_radianos=Math.toRadians(angulo);
        
        double seno=Math.sin(angulo_em_radianos);
        double cosseno=Math.cos(angulo_em_radianos);
        double tangente=Math.tan(angulo_em_radianos);
        double secante=(1/cosseno);
        double cossecante=(1/seno);
        double cotangente=(1/tangente);
        
        JOptionPane.showMessageDialog(null,"Angulo: " + angulo
        + "\n" + "Seno: " + seno
        + "\n" + "Cosseno: " + cosseno
        + "\n" + "Tangente: " + tangente 
        + "\n" + "Secante: " + secante
        + "\n" + "Cossecante: " + cossecante
        + "\n" + "cotangente: " + cotangente);
        }
    }
