import javax.swing.JOptionPane;

public class Q49 {
	/**
		49. Faça um programa que leia um número se ele for maior que 20, então imprima sua metade.
	*/

	public static void main (String[] args) {
		double n = Double.parseDouble(JOptionPane.showInputDialog("Número: "));
		String text = "Número: " + n + "\n";

		if (n > 20) {
			text += "Sua metade é " + (n / 2);
			JOptionPane.showMessageDialog(null, text);
		}
	}
}
