import javax.swing.JOptionPane;

public class Q50 {
	/**
		50. Faça um programa que leia um número, se ele for positivo, imprima seu inverso,
		caso contrário imprima o valor absoluto do número.
	*/

	private static int inverso(int numero) {
		int novoNumero = 0;
		for(numero = numero; numero != 0; numero /= 10) {
			int digito = numero % 10;
			novoNumero =  (novoNumero * 10) + digito;
		}
		return novoNumero;
	}

	public static void main (String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
		String text = "Número";

		if (n > 0) {
			text += " inverso: " + inverso(n);
		} else {
			text += ": " + n;
		}

		JOptionPane.showMessageDialog(null, text);
	}
}
