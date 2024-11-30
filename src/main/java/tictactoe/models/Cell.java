package tictactoe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Cell {
	private int x;
	private int y;
	private char symbol;
	
	public Cell(int x,int y, char symbol) {
		this.symbol = symbol;
		this.x = x;
		this.y = y;
	}

	public Cell(int i, int j) {
		this.x = i;
		this.y = j;
	}

}
