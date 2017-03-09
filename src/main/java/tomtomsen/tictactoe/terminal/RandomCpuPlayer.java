package tomtomsen.tictactoe.terminal;

import tomtomsen.tictactoe.core.*;
import java.util.Random;
import java.lang.String;

public class RandomCpuPlayer implements tomtomsen.tictactoe.terminal.Player2 {

    public Location makeMove(Board board) {

    	try {
	    	Random random = new Random();

	    	while (!board.isFull()) {
		    	int row = random.nextInt(3);
		    	int col = random.nextInt(3);
		    	if (!board.hasPieceAt(new Location(col, row))) {
		    		return new Location(col, row);
		    	}
		    }
		} catch (Exception exception) {

		}

	    return new Location(0, 0);
    }

    public void assignPiece(final Piece piece) {
    }

    public boolean giveUp() {
    	return false;
    }

    public String name() {
    	return "CPU";
    }
}
