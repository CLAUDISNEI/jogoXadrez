package xadrez;

import tabuleiroJogo.Tabuleiro;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;

	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
	}

	public PecaXadrez[][] getPecasXadrez() {
		PecaXadrez[][] matriz = new PecaXadrez[tabuleiro.getQuantLinhas()][tabuleiro.getQuantColunas()];
		for (int i = 0; i < tabuleiro.getQuantLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getQuantColunas(); j++) {
				matriz[i][j] = (PecaXadrez) tabuleiro.pecasJogo(i, j);
			}
		}

		return matriz;
	}

}
