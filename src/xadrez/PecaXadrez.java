package xadrez;

import tabuleiroJogo.PecaJogo;
import tabuleiroJogo.Tabuleiro;

public class PecaXadrez extends PecaJogo {
	
	private Cores cor;

	public PecaXadrez(Tabuleiro tabuleiro, Cores cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cores getCor() {
		return cor;
	}

		
}
