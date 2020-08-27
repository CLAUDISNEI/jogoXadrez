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

	public int getQuantColunas() {
		return quantColunas;
	}

	public void setQuantColunas(int quantColunas) {
		this.quantColunas = quantColunas;
	}

	public PecaJogo[][] getPecasJogo() {
		return pecasJogo;
	}

	public void setPecasJogo(PecaJogo[][] pecasJogo) {
		this.pecasJogo = pecasJogo;
	}
	
	
	
}
