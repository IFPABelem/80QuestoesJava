import javax.swing.JOptionPane;

public class Q44 {
	/**
		44. Faça um programa que leia dois números reais e exiba na tela o quadrado da diferença do
		primeiro valor pelo segundo e a diferença dos quadrados.
	*/

	public static void main (String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Número A: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Número B: "));

		double quadradoDiferenca = Math.pow((a - b), 2);
		double diferencaDosQuadrados = Math.pow(a, 2) - Math.pow(b, 2);

		String text = "Quadrado da diferença: " + quadradoDiferenca + "\n"
			+ "Diferença dos quadrados: " + diferencaDosQuadrados;
		JOptionPane.showMessageDialog(null, text);
	}
}
