package model;


public class PionNoir extends AbstractPion {
	
	
	/**
	 * @param name
	 * @param couleur_de_piece
	 * @param coord
	 */
	public PionNoir(String name, Couleur couleur_de_piece, Coord coord) {
		super(name, couleur_de_piece, coord);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param couleur_de_piece
	 * @param coord
	 */
	public PionNoir(Couleur couleur_de_piece, Coord coord) {
		super(couleur_de_piece, coord);
		// TODO Auto-generated constructor stub
	}

	
	/* (non-Javadoc)
	 * @see model.AbstractPiece#isMoveOk(int, int)
	 */
	@Override
	public boolean isMoveOk(int xFinal, int yFinal, boolean isCatchOk, boolean isCastlingPossible) {

		boolean ret = false;

		// Déplacement vertical
		if (!isCatchOk && !isCastlingPossible){

			if ((xFinal == this.getX())
					&& (Math.abs(yFinal - this.getY()) <= 1 || 
					(Math.abs(yFinal - this.getY()) <= 2 && this.isPremierCoup()==true))) {

				if (yFinal - this.getY() > 0) {
					ret = true;
				}
			}
		}
		// Déplacement diagonal
		else {
				if ((yFinal == this.getY()+1 && xFinal == this.getX()+1) 
						|| (yFinal == this.getY()+1 && xFinal == this.getX()-1)) {
					ret = true;
				}	
		}

		return ret;
	}

	/* (non-Javadoc)
	 * @see model.Pions#isMoveDiagOk(int, int)
	 */
	@Override
	public boolean isMoveDiagOk(int xFinal, int yFinal) {
		
		boolean ret = false;

		if ((yFinal == this.getY()+1 && xFinal == this.getX()+1) 
				|| (yFinal == this.getY()+1 && xFinal == this.getX()-1)) {
			ret = true;
		}
			
		return ret;
	}




	

}
