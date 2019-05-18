import javax.swing.JOptionPane;

public class Q51 {
	/**
		51. Faça um programa que leia um número e imprima se ele é ímpar ou par.
	*/

	public static void main (String[] args) {
		double n = Double.parseDouble(JOptionPane.showInputDialog("Número: "));
		String text = "Número é ";

		if (n % 2 == 0) {
			text += "par";
		} else {
			text += "ímpar";
		}

		JOptionPane.showMessageDialog(null, text);
	}
}
