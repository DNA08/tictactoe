package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Move;

public interface GameWinningStrategies {
	public boolean hasWin(Board board, Move move);

}
