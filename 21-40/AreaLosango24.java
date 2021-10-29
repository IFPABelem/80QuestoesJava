/*
24. Faça um programa que calcule e exiba na tela a área de um losango.
 */
package vale4pontos;

import javax.swing.JOptionPane;

/*
Fórmula: área = (diagonal_maior x diagonal_menor) / 2 
*/

public class AreaLosango24 
{
    public static void main(String[] args)
    {   
        boolean isDouble = false;
        double diagonal_maior = 0, diagonal_menor = 0;
        double area = 0;
        
        do
        {
            try {
                diagonal_maior = Double.parseDouble(JOptionPane.showInputDialog("Digite a diagonal maior: "));
                diagonal_menor = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da diagonal menor: "));

                area =(diagonal_maior * diagonal_menor) / 2;

                JOptionPane.showMessageDialog(null, "Área do losango: " + area);
                
                if(isDouble){
                    isDouble = false;
                }
                
            } catch (Exception e) {
                isDouble = true;
                JOptionPane.showMessageDialog(null, "Por favor, digite um número");
            }
            
            
        }while(isDouble);
    }
}
