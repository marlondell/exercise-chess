package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // apenas para enfatiza, por padr�o o Java j� joga como nulo
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
