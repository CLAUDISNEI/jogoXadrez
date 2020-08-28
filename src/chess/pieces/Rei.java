package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rei extends ChessPiece {

	public Rei(Board tabuleiro, Color cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
