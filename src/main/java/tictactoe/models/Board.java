package tictactoe.models;


import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Board {
	
	private List<List<Cell>> cells;
	private int dimension;
	
	public Board(int dimension) {
		this.dimension = dimension;
		cells = new ArrayList<>();
		for(int i = 0; i < dimension; i++) {
			cells.add(i,new ArrayList<Cell>());
			for(int j = 0; j < dimension; j++) {
				cells.get(i).add(new Cell(i,j));
			}
		}
	}

}
