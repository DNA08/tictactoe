package tictactoe.strategy.botPlaying;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Player;

public interface BotPlayingStrategy {
	Move playMove(Player player, Board board);

}
