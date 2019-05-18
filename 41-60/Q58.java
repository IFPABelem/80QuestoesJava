import javax.swing.JOptionPane;

public class Q58 {
	/**
		58. A prefeitura abriu uma linha de credito para os funcionários estatutários.
		O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
		Faça um programa que permita ler um salário bruto e o valor da prestação e imprimir
		se é ou não possível fazer o empréstimo.
	*/

	public static void main (String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: R$"));
		double prestacao = Double.parseDouble(JOptionPane.showInputDialog("Prestação: R$"));

		String text = "Salário: R$" + salario + "\n"
			+ "Prestação: R$" + prestacao + "\n"
			+ "Status: ";
		if (prestacao > 0.3 * salario) {
			text += "REJEITADO";
		} else {
			text += "APROVADO";
		}

		JOptionPane.showMessageDialog(null, text);
	}
}
