import javax.swing.JOptionPane;

public class Q57 {
	/**
		57. Faça um programa que lei um número e imprima se ele é divisível por 10,
		por 5, por 2 ou por nenhum destes.
	*/

	public static void main (String[] args) {
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Número: "));
		String text = "Divisível por ";


		if (numero % 10 == 0) {
			text += "10.";
		} else if (numero % 5 == 0) {
			text += "5.";
		} else if (numero % 2 == 0) {
			text += "2.";
		} else {
			text += "por nenhum destes.";
		}

		JOptionPane.showMessageDialog(null, text);
	}
}
