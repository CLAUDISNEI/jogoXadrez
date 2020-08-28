package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Torre extends ChessPiece{

	public Torre(Board tabuleiro, Color cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}