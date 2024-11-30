package tictactoe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Move {
	
	private Cell cell;
	private Player player;
	
	public Move(Cell cell, Player player) {
		super();
		this.cell = cell;
		this.player = player;
	}
	
	

}
