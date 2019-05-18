import javax.swing.JOptionPane;

public class Q60 {
	/**
		60. Faça um programa que indique se o número digitado está entre 20 e 90 ou não.
	*/

	public static void main (String[] args) {
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Número: "));
		String text = "Número tá entre 20 e 90: ";

		if (numero > 20 && numero < 60) {
			text += "SIM.";
		} else {
			text += "NÂO.";
		}

		JOptionPane.showMessageDialog(null, text);
	}
}
