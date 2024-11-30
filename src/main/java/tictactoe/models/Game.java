package tictactoe.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tictactoe.strategy.CornerWinningStrategy;
import tictactoe.strategy.GameWinningStrategies;

@Getter
@Setter
@ToString
public class Game {
	private List<Player>players;
	private Board board;
	private Player winner;
	private GameStatus gameStatus;
	private int lastPlayedBy;
	private List<GameWinningStrategies> strategies;
	
	public Game(int dimenson, List<Player>players) {
		this.board = new Board(dimenson);
		this.players = players;
		this.gameStatus = GameStatus.IN_PROGRESS;
		this.lastPlayedBy = 0;
		this.strategies = new ArrayList<>();
		this.strategies.add(new CornerWinningStrategy());
	}

	public boolean hasCurrentPlayerWon(Move move) {
		for(GameWinningStrategies strategies : this.strategies) {
			if(strategies.hasWin(board, move)) {
				return true;
			}
		}
		return false;
		
	}

}
