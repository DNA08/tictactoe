package tictactoe.models;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HumanPlayer extends Player {
	private String name;
	private char symbol;
	
	public HumanPlayer(String name,String symbol) {
		super(PlayerType.HUMAN);
		this.name = name;
		this.symbol = symbol.charAt(0);
	}
	
	public Cell playNextMove(Player player) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(player.getName()+" please give x and y cordinates");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return new Cell(x,y,this.symbol);
	}

}
