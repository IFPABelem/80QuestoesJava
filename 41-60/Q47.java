import javax.swing.JOptionPane;

public class Q47 {
	/**
		47. Faça um programa que leia a quantidade de fitas que uma locadora de vídeo possui e o
		valor que ela cobra por cada aluguel, mostrando as informações pedidas a seguir:

		A) Sabendo-se que um terço das fitas são alugadas por mês, exiba o faturamento anual da locadora

		B) Quando o cliente atrasa a entrega, é cobrada uma multa de 10% sobre o valor do aluguel,
			sabe-se que um décimo das fitas alugadas por mês são devolvidas com atraso, calcule o
			valor ganho com multas por mês.

		C) Sabendo-se que 2% de fitas se estragam ao longo do ano, e um décimo do total é comprado
			para a reposição, exiba a quantidade de fitas que a locadora terá o final do ano
	*/

	public static void main (String[] args) {
		int quantidadeFitas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de fitas: "));
		double valorAluguel = Double.parseDouble(JOptionPane.showInputDialog("Valor por aluguel: R$"));

		int quantidadeAlugadaMes = quantidadeFitas / 3;
		double faturamentoAluguelMes = quantidadeAlugadaMes * valorAluguel;
		double faturamentoAluguelAnual = faturamentoAluguelMes * 12;

		double valorAtraso = 0.1 * valorAluguel;
		int quantidadeAtrasoMes = (int)(0.1 * quantidadeAlugadaMes);
		double faturamentoAtrasoMes = quantidadeAtrasoMes * valorAtraso;

		int quantidadeEstradasFitasAno = (int)(0.02 * quantidadeFitas);
		int quantidadeNovasFitasAno = (int)(quantidadeFitas * 0.1);
		int quantidadeTotalFitasAno = quantidadeFitas - quantidadeEstradasFitasAno + quantidadeNovasFitasAno;

		String text = "Faturamento anual da locadora somente com locação das fitas: R$" + faturamentoAluguelAnual + "\n"
			+ "Faturamento com multas por mês: R$" + faturamentoAtrasoMes + "\n"
			+ "Quantidade de novas: " + quantidadeTotalFitasAno;
		JOptionPane.showMessageDialog(null, text);
	}
}
