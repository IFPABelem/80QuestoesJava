import javax.swing.JOptionPane;

public class Q42 {
	/**
		42. Faça um programa que leia o peso de uma pessoa (só a parte inteira), calcule e exiba na tela:
		o peso da pessoa em gramas, novo peso (em gramas, se a pessoa engordar 12%).
	*/

	public static void main (String[] args) {
		int pesoEmKilo = Integer.parseInt(JOptionPane.showInputDialog("Peso (kg): "));
		int pesoEmGramas = pesoEmKilo * 1000;
		int novoPesoEmGramas = (int)(0.12 * pesoEmGramas + pesoEmGramas);

		String text = "Peso em gramas: " + pesoEmGramas + "\n"
			+ "Peso em gramas, se engordar 12%: " + novoPesoEmGramas;
		JOptionPane.showMessageDialog(null, text);
	}
}
