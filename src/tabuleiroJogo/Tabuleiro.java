package tabuleiroJogo;

public class Tabuleiro {

	private int quantLinhas;
	private int quantColunas;
	private PecaJogo[][] pecasJogo;
	
	public Tabuleiro(int quantLinhas, int quantColunas) {
		this.quantLinhas = quantLinhas;
		this.quantColunas = quantColunas;
		pecasJogo = new PecaJogo[quantLinhas][quantColunas];
	}

	

	public int getQuantLinhas() {
		return quantLinhas;
	}

	public int getQuantColunas() {
		return quantColunas;
	}

	public PecaJogo[][] getPecasJogo() {
		return pecasJogo;
	}

	public void setPecasJogo(PecaJogo[][] pecasJogo) {
		this.pecasJogo = pecasJogo;
	}
	
	public PecaJogo pecasJogo(int linha, int coluna) {
			return pecasJogo[linha][coluna];
	}
	
	public PecaJogo pecasJogo(Posicao posicaoPeca) {
		return  pecasJogo[posicaoPeca.getLinha()][posicaoPeca.getColuna()];
	}
	
}
