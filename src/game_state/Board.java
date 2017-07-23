package game_state;

import java.io.File;

import entities.Entity;

public class Board {
	
	private Entity[][][] mGameBoard;
	
	public Board() {
		
	}
	
	public static Board loadBoardFromFile(File file) {
		return loadBoard(file);
	}
	
	private static Board loadBoard(File file) {
		return null;
	}
	
	
	
	public Entity getObjectAt(int x, int y, int z) {
		return null;
	}

}
