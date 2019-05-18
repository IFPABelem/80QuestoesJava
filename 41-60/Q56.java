import javax.swing.JOptionPane;

public class Q56 {
	/**
		56. Faça um programa que leia um números e imprima uma das mensagens:
		é múltiplo de 3 ou não é múltiplo de 3.
	*/

	public static void main (String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));

		String text = "Número " + numero + " ";
		if (numero % 3 != 0) {
			text += "não ";
		}
		text += "é múltiplo de 3!";

		JOptionPane.showMessageDialog(null, text);
	}
}
