import javax.swing.JOptionPane;

public class Q48 {
	/**
		48. Faça um programa que dado um número de conta corrente com três dígitos, retorne
		o seu dígito verificador, o qual é calculado da seguinte forma:

		Exemplo: número de conta: 235

		A) Somar o número da conta com o seu inverso: 235 + 532 = 767.

		B) Multiplicar cada dígito pela sua ordem posicional e somar estes resultados:
			i. 7 6 7
			   1 2 3

		C) X 1 2 3
			i. 7+12+21=40

		D) O último dígito desse resultado é o dígito verificador da conta(40 -> 0).
	*/

	private static int ler () {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Conta corrente (3 dígitos): "));
		if (numero < 0 || numero > 999) { //000...999
			return ler();
		}

		return numero;
	}

	private static int inverso (int numero) {
		int novoNumero;
		for(novoNumero = 0; numero != 0; numero /= 10) {
			int digito = numero % 10;
			novoNumero =  (novoNumero * 10) + digito;
		}
		return novoNumero;
	}

	private static int multiplicarSomar (int numero) {
		int novoNumero = 0;
		for(int n = 0; numero > 0; numero /= 10) {
			int digito = numero % 10;
			n++;
			novoNumero += digito * n;
		}
		return novoNumero;
	}

	private static int ultimo (int numero) {
		return numero % 10;
	}

	public static void main (String[] args) {
		int contaCorrente = ler();

		int digitoVerificador = contaCorrente + inverso(contaCorrente); // A
		digitoVerificador = multiplicarSomar(inverso(digitoVerificador)); // B & C
		digitoVerificador = ultimo(digitoVerificador); // D

		String text = "Conta corrente: " + contaCorrente + "\n"
			+ "Dígito verificador: " + digitoVerificador;
		JOptionPane.showMessageDialog(null, text);
	}
}
