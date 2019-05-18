import javax.swing.JOptionPane;

public class Q46 {
	/**
		46. Uma pessoa resolveu fazer uma aplicação na poupança programada.
		Para calcular seu rendimento, ela deverá fornecer o valor constante da aplicação mensal,
		a taxa e o número de meses.

		Sabendo-se que a fórmula é:
			VALOR ACUMULADO = P * ((1 + i) ^n - 1) / i.
			P = aplicação mensal; i = taxa; n = número de meses.
	*/

	public static void main (String[] args) {
		double p = Double.parseDouble(JOptionPane.showInputDialog("Aplicação mensal: "));
		double i = Double.parseDouble(JOptionPane.showInputDialog("Taxa: "));
		int n = Integer.parseInt(JOptionPane.showInputDialog("Número de meses: "));

		double valorAcumulado = p * (Math.pow((1 + i), (n - 1))) / i;

		String text = "Aplicação mensal: " + p + "\n"
			+ "Taxa: " + i + "\n"
			+ "Número de meses: " + n + "\n"
			+ "Valor acumulado: " + valorAcumulado;
		JOptionPane.showMessageDialog(null, text);
	}
}
