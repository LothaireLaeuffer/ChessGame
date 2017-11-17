package model;

public class ChessGame implements BoardGames{

	private Echiquier echiquier;
	
	public ChessGame(Echiquier echiquier)
	{
		this.echiquier = echiquier;
	}
	public ChessGame()
	{
		this.echiquier = new Echiquier();
	}
	
	@Override
	public boolean move(int xInit, int yInit, int xFinal, int yFinal) {
		
		if(echiquier.isMoveOk(xInit, yInit, xFinal, yFinal)) {
			if(echiquier.move(xInit, yInit, xFinal, yFinal)) {
				echiquier.switchJoueur();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isEnd() {
		return echiquier.isEnd();
	}

	@Override
	public String getMessage() {
		return echiquier.getMessage();
	}

	@Override
	public Couleur getColorCurrentPlayer() {
		return echiquier.getColorCurrentPlayer();
	}

	@Override
	public Couleur getPieceColor(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return echiquier.toString()+ this.getMessage();
	}
	
	public static void main(String[] args) {
		ChessGame chessGame = new ChessGame();
		boolean isMoveOK = false;
		
		System.out.println("Test classe Echiquier\n");
		
		System.out.println(chessGame);
	
		System.out.print("\n Déplacement de 3,6 vers 3,4 = ");
		isMoveOK = chessGame.move(3, 6, 3, 4);		// true
		System.out.println(chessGame.toString() + "\n");	
		
		System.out.print("\n Déplacement de 3,4 vers 3,6 = ");
		isMoveOK = chessGame.move(3, 4, 3, 6); 	// false : autre joueur
		System.out.println(chessGame.toString() + "\n");
		
		System.out.print("\n Déplacement de 3,4 vers 3,6 = ");
		isMoveOK = chessGame.move(3, 4, 3, 6); 	// false : algo KO
		System.out.println(chessGame.toString() + "\n");	
		
		// ...
	
		
	}

}
