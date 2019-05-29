
import javax.swing.JOptionPane;

public class notas {

    public static void main(String[] args) {

//        double numero = Double.parseDouble(JOptionPane.showInputDialog("Número: "));
//        String text = "Divisível por ";
//
//        if (numero%2 != 0 && numero%5 !=0 && numero%10 !=0) {
//            text += "por nenhum destes.";
//        }else {
//            if (numero % 10 == 0) {
//                text += " 10 ";
//            }
//            if (numero % 5 == 0) {
//                text += " 5 ";
//            }
//            if (numero % 2 == 0) {
//                text += " 2 ";
//            }
//        }
//        JOptionPane.showMessageDialog(null, text);

//        //65 - Faça um programa que leia 3 números e imprima-os em ordem decrescente
//        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número"));
//        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número"));
//        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira o terceiro número"));
//        
//        double[] numeros = {n1, n2, n3};
//        n2+=n1+n3;
////        {+312, +321, 132, +123, +213, +231}
//        for (double numero : numeros) {
//            if(numero>n3){
//                n3=numero;
//            }else if(numero<n1){
//                n1=numero;
//            }
//        }
//        
//        n2-=n1+n3;
//        
//        JOptionPane.showMessageDialog(null, n3+"\n"+n2+"\n"+n1);

 //66 - Faça um programa que leia 3 números e armazene-os em 3 variáveis com os seguintes nomes: maior, intermediário e menor.
 
        double menor = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número"));
        double intermediario = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número"));
        double maior = Double.parseDouble(JOptionPane.showInputDialog("Insira o terceiro número"));

        double[] numeros = {menor, intermediario, maior};
        intermediario+=menor+maior;
//        {+312, +321, 132, +123, +213, +231}
        for (double numero : numeros) {
            if(numero>maior){
                maior=numero;
            }else if(numero<menor){
                menor=numero;
            }
        }
        
        intermediario-=menor+maior;

        JOptionPane.showMessageDialog(null,
                "Maior: " + maior
                + "\nIntermediario: " + intermediario
                + "\nMenor: " + menor);

    }
}
