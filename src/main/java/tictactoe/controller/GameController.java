package tictactoe.controller;

import java.util.List;

import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.Game;
import tictactoe.models.Move;
import tictactoe.models.Player;

public class GameController {
	
	
	public Game createGame(int dimension, List<Player>players) {
		return new Game(dimension, players);
	}

	public Cell playNextMove(Player currentPlayer) {
		return currentPlayer.playNextMove(currentPlayer);
	}

	public void printBoard(Game game) {
		for(List<Cell> c : game.getBoard().getCells()) {
			for(Cell c1 : c) {
				System.out.print(c1.getSymbol()+"  ");
			}
			System.out.println();
		}
	}

	public void updateBoard(Game game, Move move) {
		Cell c = move.getCell();
		int x = c.getX();
		int y = c.getY();
		game.getBoard().getCells().get(x).set(y, c);
	}

	public boolean hasCurrentPlayerWon(Move move,Game game) {
		return game.hasCurrentPlayerWon(move);
	}

	public boolean checkAllCellsFilled(Game game) {
		// TODO Auto-generated method stub
		return false;
	}

}
