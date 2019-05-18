import javax.swing.JOptionPane;

public class Q59 {
	/**
		59. Faça um programa que leia um inteiro de 3 casas decimais e imprima se o
		algarismo da centena é impar ou par.
	*/

	private static int ler () {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
		if (numero < 99) {
			return ler();
		}

		return numero;
	}

	public static void main (String[] args) {
		int numero = ler();
		String text = "Número é ";

		int centena = numero / 100;
		if (centena % 2 == 0) {
			text += "par.";
		} else {
			text += "ímpar.";
		}

		JOptionPane.showMessageDialog(null, text);
	}
}
