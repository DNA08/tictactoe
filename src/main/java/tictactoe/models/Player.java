package tictactoe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Player {

	private String name;
	private char symbol;
	private PlayerType playerType;
	
	public Player(PlayerType playerType) {
		this.playerType = playerType;
	}

	public abstract Cell playNextMove(Player currentPlayer);
	
}
