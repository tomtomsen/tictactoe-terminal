package tomtomsen.tictactoe.terminal;

import tomtomsen.tictactoe.core.*;
import java.lang.String;
import java.util.Scanner;

public class InputPlayer implements tomtomsen.tictactoe.terminal.Player2 {

	private Scanner terminalInput;

	public InputPlayer(Scanner scanner) {
    	terminalInput = scanner;
	}

    public int[] makeMove(Board board, Piece yourPiece) {

		int col = 0;
		int row = 0;

		try {
			do {
				System.out.print("Column [1-3]: ");
		    	do {
		    		col = terminalInput.nextInt();
		    	} while (col < 1 || col > 3);
		    	System.out.println();


				System.out.print("Row [1-3]: ");
		    	do {
		    		row = terminalInput.nextInt();
		    	} while (row < 1 || row > 3);
		    	System.out.println();

		    } while (board.hasPieceAt(col-1, row-1));
		} catch (Exception ex) {
			System.out.println("unexpected exception2 " + ex);
			return new int[] {0, 0};
		}
	    return new int[] {col-1, row-1};
    }

    public boolean giveUp() {
    	return false;
    }

    public String name() {
    	return "Player 1";
    }
}
