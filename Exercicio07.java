package MetodosMatematicos;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {

		/*
		 * Comprimento de Tábuas: Crie um programa que calcula quantas tábuas de madeira
		 * de x metro são necessárias para cobrir um determinado comprimento em metros,
		 * usando Math.floor(x) para arredondar para baixo.
		 */

		Double comprimentoTotal, metroFornecido = null;

		int contador = 0, soma = 0;

		comprimentoTotal = 10.0;

		do {

			try {

				metroFornecido = Double.parseDouble(

						JOptionPane.showInputDialog(null, " Digite a quantidade em metros do pedaço de tábua"));

				if (metroFornecido <= 0) {
					JOptionPane.showMessageDialog(null,
							" ERRO! \n Você  preencheu o campo com números inválidos , digitou 0 (zero) ou um número negativo");

				}

				else {

					Double valorArredondado;

					valorArredondado = Math.floor(metroFornecido) * 100 / 100;

					JOptionPane.showMessageDialog(null, " Valor fornecido pelo usuário = " + metroFornecido
							+ " Valor arredondado = " + valorArredondado);

					soma += metroFornecido;

					contador++;
				}

			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, " ERRO! \n Você não preencheu o campo com números");
			}

		} while (soma < comprimentoTotal);

		JOptionPane.showMessageDialog(null,
				"Foram necessárias : " + contador + " tábuas para preencher a quantidade de = " + comprimentoTotal);
	}

}
