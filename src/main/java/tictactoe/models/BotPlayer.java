package tictactoe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tictactoe.strategy.botPlaying.BotPlayingStrategy;

@Getter @Setter @ToString
public class BotPlayer extends Player {
	
	private BotPlayingStrategy botPlayingStrategy;
	private String name;
	private BotDifficulty botDifficulty;
	private char symbol;
	
	public BotPlayer(String name, String botDifficulty, String symbol) {
		super(PlayerType.BOT);
		this.name = name;
		this.botDifficulty = BotDifficulty.valueOf(botDifficulty);
		this.symbol = symbol.charAt(0);
	}

	@Override
	public Cell playNextMove(Player currentPlayer) {
		// TODO Auto-generated method stub
		System.out.println(currentPlayer.getName()+" is bot and playing its move");
//		this.botPlayingStrategy.playMove();
		return null;
	}
	

}
