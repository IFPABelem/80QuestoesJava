import javax.swing.JOptionPane;

public class Q50 {
	/**
		50. Faça um programa que leia um número, se ele for positivo, imprima seu inverso,
		caso contrário imprima o valor absoluto do número.
	*/

	private static String inverso(String numeroStr) {
		String novoNumero = "";
		int tamanho = numeroStr.length();
		for(int i = 0; i < tamanho; i++) {
			novoNumero += numeroStr.charAt(tamanho - i - 1);
		}
		return novoNumero;
	}

	public static void main (String[] args) {
		String numeroStr = JOptionPane.showInputDialog("Número: ");
		int numero = Integer.parseInt(numeroStr);
		String text = "Número";

		if (numero > 0) {
			text += " inverso: " + inverso(numeroStr);
		} else {
			text += " absoluto: " + Math.abs(numero);
		}

		JOptionPane.showMessageDialog(null, text);
	}
}
