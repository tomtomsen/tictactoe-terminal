package tomtomsen.tictactoe.terminal;

import tomtomsen.tictactoe.core.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) throws Exception {
		System.out.println("Wanna play a round of tic tac toe?");

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		Player2 players[] = new Player2[2];

		int firstPlayer = random.nextInt(2);

		if (firstPlayer == 0) {
			players[0] = new InputPlayer(scanner);
			players[1] = new RandomCpuPlayer();
		} else {
			players[0] = new RandomCpuPlayer();
			players[1] = new InputPlayer(scanner);
		}
		TerminalRenderer renderer = new TerminalRenderer();

		System.out.println(players[0].name() + " starts");
		Game game = new Game(players[0], players[1], new Board(), renderer);
		renderer.preGame(game);
		game.run();

		scanner.close();
	}
}
