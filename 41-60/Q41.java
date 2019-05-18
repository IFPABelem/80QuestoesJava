import javax.swing.JOptionPane;

public class Q41 {
	/**
		41. Faça um programa que leia o valor do salário mínimo e o valor do salário de uma pessoa.
		Calcule e exiba na tela quantos salários mínimos ela ganha.
	*/

	public static void main (String[] args) {
		double salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("Salário Mínimo: "));
		double salarioDaPessoal = Double.parseDouble(JOptionPane.showInputDialog("Salário da pessoal: "));
		double total = salarioDaPessoal / salarioMinimo;

		String text = "Salário mínimo: R$" + salarioMinimo + "\n"
			+ "Salário da pessoal: R$" + salarioDaPessoal + "\n"
			+ "Ele receber " + total + " salários mínimos.";
		JOptionPane.showMessageDialog(null, text);
	}
}
