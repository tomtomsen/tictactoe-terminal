package tomtomsen.tictactoe.terminal;

import tomtomsen.tictactoe.core.*;
import java.lang.String;

public class TerminalRenderer implements Renderer {

    public void preGame(Game game) {
        Board board = game.getBoard();

        renderBoard(board);
    }

    public void update(Game game) {
    	Board board = game.getBoard();

        renderBoard(board);

    }

    protected void renderBoard(Board board) {
    	try {
            for(int row = 0; row < board.BOARDSIZE; row ++) {
                System.out.print("        ");
				System.out.print(getPieceAsString(board.pieceAt(0, row)));
                System.out.print("|");
                System.out.print(getPieceAsString(board.pieceAt(1, row)));
                System.out.print("|");
                System.out.print(getPieceAsString(board.pieceAt(2, row)));
                System.out.println();
                if (row < board.BOARDSIZE-1)
                    System.out.println("       -------");
			}
            System.out.println();
            System.out.println();
			System.out.println();
		} catch (Exception ex) {
			System.out.println("fatal exception");
		}
    }

    protected String getPieceAsString(Piece piece) {
    	switch (piece) {
    		case CIRCLE:
    			return "O";

    		case CROSS:
    			return "X";
    	}

    	return " ";
    }

    public void gameEnded(Game game) {
    	if (game.isDraw()) {
    		System.out.println("------- DRAW -------");
    	} else {
    		tomtomsen.tictactoe.terminal.Player2 winner = (tomtomsen.tictactoe.terminal.Player2) game.getWinner();
    		System.out.print("------- ");
    		System.out.print(winner.name());
    		System.out.println(" -------");
    	}
    }
}
