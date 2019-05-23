import javax.swing.JOptionPane;

public class Q52 {
	/**
		52. Faça um programa que leia um número e imprima se ele é positivo, negativo ou nulo.
	*/

	public static void main (String[] args) {
		double n = Double.parseDouble(JOptionPane.showInputDialog("Número: "));
		String text = "Número é ";

		if (n == 0) {
			text += "nulo";
		} else if (n > 0) {
			text += "positivo";
		} else {
			text += "negativo";
		}

		JOptionPane.showMessageDialog(null, text);
	}
}
