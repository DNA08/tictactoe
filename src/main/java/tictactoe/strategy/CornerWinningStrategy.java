package tictactoe.strategy;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Player;

public class CornerWinningStrategy implements GameWinningStrategies {

	@Override
	public boolean hasWin(Board board, Move move) {
		Player player = move.getPlayer();
		int dim = board.getDimension();
		if(board.getCells().get(0).get(0).getSymbol() == board.getCells().get(0).get(dim - 1).getSymbol()
				&& board.getCells().get(0).get(0).getSymbol() == board.getCells().get(dim - 1).get(0).getSymbol()
			&& board.getCells().get(0).get(0).getSymbol() == board.getCells().get(dim - 1).get(dim - 1).getSymbol()
			&& board.getCells().get(0).get(0).getSymbol() == player.getSymbol()) {
			return true;
		}
		return false;
	}

}
