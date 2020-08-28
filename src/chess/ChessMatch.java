package chess;

import boardgame.Position;
import chess.pieces.Rei;
import chess.pieces.Torre;
import boardgame.Board;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		setupInicial();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return mat;
	}
	
	private void setupInicial() {
		board.positionPiece(new Torre(board, Color.WHITE), new Position(2, 1));
		board.positionPiece(new Rei(board, Color.BLACK), new Position(0, 4));
	}

}
