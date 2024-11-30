package tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tictactoe.controller.GameController;
import tictactoe.exception.PlayerBoardInValidException;
import tictactoe.models.BotPlayer;
import tictactoe.models.Cell;
import tictactoe.models.Game;
import tictactoe.models.GameStatus;
import tictactoe.models.HumanPlayer;
import tictactoe.models.Move;
import tictactoe.models.Player;
import tictactoe.models.PlayerType;

public class TicTacToe {

	public static void main(String[] args) {
		GameController gameController = new GameController();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimension of the board");
		int dimension = sc.nextInt();
		System.out.println("Enter the number of Players in the game");
		int noOfPlayer = sc.nextInt();
		if(dimension <= noOfPlayer) {
			throw new PlayerBoardInValidException("No of players should be less than the Dimension of the board");
		}
		
		List<Player>players = new ArrayList<Player>(noOfPlayer); 
		for(int i = 0; i < noOfPlayer; i++) {
			System.out.println("is the player BOT: Y/N");
			String isBot = sc.next();
			if(isBot.equalsIgnoreCase("Y")) {
				System.out.println("Enter the name of the Bot");
				String name = sc.next();
				System.out.println("Enter the difficulty of the Bot: EASY,MEDIUM or HARD");
				String difficulty = sc.next();
				System.out.println("Enter the Symbol of the Bot");
				String symbol = sc.next();
				Player player = new BotPlayer(name,difficulty.toUpperCase(),symbol);
				players.add(player);
			}else {
				System.out.println("Enter the name of the Player");
				String name = sc.next();
				System.out.println("Enter the Symbol of the Player:"+i);
				String symbol = sc.next();
				Player player = new HumanPlayer(name,symbol);
				players.add(player);
			}
		}
		Game game = gameController.createGame(dimension, players);
		System.out.println(game);
		
		while(game.getGameStatus().equals(GameStatus.IN_PROGRESS)) {
			int playerIndex = game.getLastPlayedBy() % players.size();
			Player currentPlayer = players.get(playerIndex);
			Cell cell = gameController.playNextMove(currentPlayer);
			Move move = new Move(cell,currentPlayer);
			gameController.updateBoard(game,move);
			gameController.printBoard(game);
			game.setLastPlayedBy(playerIndex+1);
			if(gameController.hasCurrentPlayerWon(move,game)) {
				game.setGameStatus(GameStatus.END);
			}
			if(gameController.checkAllCellsFilled(game)) {
				game.setGameStatus(GameStatus.DRAWN);
			}
		}
		if(game.getGameStatus().equals(GameStatus.END)) {
			System.out.println("Game won by "+players.get(game.getLastPlayedBy()).getName());
		}else {
			System.out.println("Game is drawn!!!");
		}
	}

}
