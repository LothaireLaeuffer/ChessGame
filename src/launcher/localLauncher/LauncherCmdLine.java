package launcher.localLauncher;

import java.util.Observer;

import controler.ChessGameControler;
import controler.ChessGameControlers;
import vue.ChessGameCmdLine;
import model.BoardGames;
import model.ChessGame;



/**
 * @author francoise.perrin
 * Lance l'exécution d'un jeu d'échec en mode console.
 */
public class LauncherCmdLine {
	
	public static void main(String[] args) {		
		
		BoardGames model;
		ChessGameControlers controler;	
		ChessGameCmdLine vue;
		
		model = new ChessGame();	
		controler = new ChessGameControler(model);
		
			
		
		vue = new ChessGameCmdLine(controler);
	
		vue.go();
	}

}
