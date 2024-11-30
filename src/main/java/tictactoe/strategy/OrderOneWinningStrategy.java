package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Move;

public class OrderOneWinningStrategy implements GameWinningStrategies {

	@Override
	public boolean hasWin(Board board, Move move) {
		
		return false;
	}

}
