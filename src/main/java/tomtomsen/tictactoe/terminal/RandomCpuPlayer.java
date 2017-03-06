package tomtomsen.tictactoe.terminal;

import tomtomsen.tictactoe.core.*;
import java.util.Random;
import java.lang.String;

public class RandomCpuPlayer implements tomtomsen.tictactoe.terminal.Player2 {

    public int[] makeMove(Board board, Piece yourPiece) {

    	try {
	    	Random random = new Random();

	    	while (!board.isFull()) {
		    	int row = random.nextInt(3);
		    	int col = random.nextInt(3);
		    	if (!board.hasPieceAt(row, col)) {
		    		return new int[] {row, col};
		    	}
		    }
		} catch (Exception exception) {

		}

	    return new int[] {0, 0};
    }

    public boolean giveUp() {
    	return false;
    }

    public String name() {
    	return "CPU";
    }
}
