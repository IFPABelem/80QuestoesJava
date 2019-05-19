import javax.swing.JOptionPane;

public class Q53 {
	/**
		53. Faça um programa que leia um peso na Terra e o número de um planeta e imprima o valor
		do seu peso no planeta escolhido.
		// TODO Número ~> Letra ?

		Gravidades relativas a Terra:

		a) 0,37 Mercúrio
		b) 0,88 Vênus
		c) 0,38 Marte
		d) 2,64 Júpiter
		e) 1,15 Saturno
		f) 1,17 Urano

		Para calcular o peso no planeta use a formula:
		Peso planeta * Peso terra / 10 * Gravidade
		// TODO ?-? Peso no Planeta = Peso / 10 * gravidade
	*/

	private static double obterPeso (double peso, double gravidade) {
		return peso / 10 * gravidade;
	}

	public static void main (String[] args) {
		String lista = "Lista de planestas e sua gravidades relativa a Terra:\n"
			+ "\t(A) 0,37 Mercúrio\n"
			+ "\t(B) 0,88 Vênus\n"
			+ "\t(C) 0,38 Marte\n"
			+ "\t(D) 2,64 Júpiter\n"
			+ "\t(E) 1,15 Saturno\n"
			+ "\t(F) 1,17 Urano\n";
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
		String planeta = JOptionPane.showInputDialog(lista + "Planeta (letra): ").toUpperCase();

		String text = "Resultado: ";
		switch (planeta) {
			case "A":
				text += obterPeso(peso, 0.37);
				break;
			case "B":
				text += obterPeso(peso, 0.88);
				break;
			case "C":
				text += obterPeso(peso, 0.38);
				break;
			case "D":
				text += obterPeso(peso, 2.64);
				break;
			case "E":
				text += obterPeso(peso, 1.15);
				break;
			case "F":
				text += obterPeso(peso, 1.17);
				break;
			default:
				text += "opção inválida!";
		}

		JOptionPane.showMessageDialog(null, text);
	}
}
