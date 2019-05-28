//8. Faça um programa que entre com dois números reais e exiba na tela a sua média aritmética, com a mensagem "Média:" antes do resultado.
package trabalhodejava;
    import javax.swing.JOptionPane;
    public class QuestaoOito
    {
        public static void main(String [] args)
        {
        float a=Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número real: "));
        float b=Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número real: "));
        float media=(a+b)/2;
        JOptionPane.showMessageDialog(null,"Média: "+media);
        }
    }