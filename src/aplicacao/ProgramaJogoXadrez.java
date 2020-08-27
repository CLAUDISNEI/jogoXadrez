package aplicacao;

import tabuleiroJogo.Posicao;
import tabuleiroJogo.Tabuleiro;
import xadrez.PartidaXadrez;

public class ProgramaJogoXadrez {

	public static void main(String[] args) {
		
		PartidaXadrez partida = new PartidaXadrez();
		UI.imprimirTabuleiro(partida.getPecasXadrez());
	}
	
	
}
