import javax.swing.JOptionPane;

public class Q54 {
	/**
		54. Faça um programa que leia 2 inteiros e efetue e a adição. Caso o valor somado seja
		maior que 20, este deverá ser imprimido somando-se a 8, caso seja menor do que 20 o mesmo
		deverá ser imprimido subtraindo-se 5.
	*/

	public static void main (String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Número A: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Número B: "));

		double numero = a + b;
		if (numero > 20) {
			numero += 8;
		} else if (numero < 20) {
			numero -= 5;
		}

		if (numero != (a + b)) {
			String text = "Resultado: " + numero;
			JOptionPane.showMessageDialog(null, text);
		}
	}
}
