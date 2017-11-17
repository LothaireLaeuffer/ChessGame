package controler;

import model.BoardGames;
import model.ChessGame;
import model.Coord;

public class ChessGameControler implements ChessGameControlers {

	public BoardGames chessGame;
	
	public ChessGameControler(BoardGames chessGame) {
		this.chessGame = chessGame;
	}
	
	@Override
	public boolean move(Coord initCoord, Coord finalCoord) {
		return chessGame.move(initCoord.x, initCoord.y, finalCoord.x, finalCoord.y);
	}

	@Override
	public String getMessage() {
		
		return chessGame.getMessage();
	}

	@Override
	public boolean isEnd() {
		return chessGame.isEnd();
	}

	@Override
	public boolean isPlayerOK(Coord initCoord) {
		// TODO Auto-generated method stub
		return false;
	}

}
