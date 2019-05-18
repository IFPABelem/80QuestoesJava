import javax.swing.JOptionPane;

public class Q45 {
	/**
		45. Dado m polígono convexo de N lados, podemos calcular o número de diagonais diferente(ND)
		desse polígono pela fórmula: ND = N (N - 3) / 2.
		Faça um programa que leia quantos lados tem o polígono, calcule e exiba na tela
		o número de diagonais diferentes do mesmo.
	*/

	public static void main (String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de lados do polígono: "));

		int nd = n * (n - 3) / 2;

		String text = "Quantidade de lados do polígono:: " + n + "\n"
			+ "Diagonais diferente: " + nd;
		JOptionPane.showMessageDialog(null, text);
	}
}
