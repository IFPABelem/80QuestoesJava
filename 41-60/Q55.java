import javax.swing.JOptionPane;

public class Q55 {
	/**
		55. Faça um programa que leia um número e imprima a raiz quadrada caso ele positivo
		e o seu quadrado caso ele seja negativo.
	*/

	public static void main (String[] args) {
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Número: "));

		String text = "Número: " + numero + "\n";
		if (numero > 0) {
			text += "Sua raiz quadrada: " + Math.sqrt(numero);
		} else if (numero < 0) {
			text = "Seu quadrado: " + (numero * numero);
		} else {
			text = "(Não fazer nada)";
		}

		JOptionPane.showMessageDialog(null, text);
	}
}
