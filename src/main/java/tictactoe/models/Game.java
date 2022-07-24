package com.gupta.sarthak.tictactoe.models;

import com.gupta.sarthak.constant.TicTacToeConstants;
import com.gupta.sarthak.tictactoe.exception.MaxNumberBotsReachedException;
import com.gupta.sarthak.tictactoe.strategies.WinningStrategy;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
public class Game {

    private List<Player> players;
    private Board board;
    private List<Move>moves;
    private List<WinningStrategy>winningStrategies;
    private State state;
    private int lastPlayerIndex;
    private Player winner;

    @Override
    public String toString() {
        return "Game{" +
                "players=" + players +
                ", board=" + board +
                ", moves=" + moves +
                ", winningStrategies=" + winningStrategies +
                ", state=" + state +
                ", lastPlayerIndex=" + lastPlayerIndex +
                ", winner=" + winner +
                '}';
    }

    private Game(){
    }

    public static Builder buildGame(){
        return new Builder();
    }


    public void undo(List<Move> moves, Player player){

    }
    @Getter
    public static class Builder{
        private List<Player> players;
        private Board board;
        private List<Move>moves;
        private List<WinningStrategy>winningStrategies;
        private State state;
        private int lastPlayerIndex;
        private Player winner;

        private Builder(){
            players = new ArrayList<>();
            winningStrategies = new ArrayList<>();
            this.lastPlayerIndex = 0;
        }

        public Builder addPlayer(Player player){
            this.players.add(player);
            return this;
        }

        public Builder addPlayers(List<Player>players) throws MaxNumberBotsReachedException {
            int count = 0;
            this.players.addAll(players);
            for(final Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    count++;
                }
            }
            if(count > TicTacToeConstants.NO_OF_BOTS){
                throw new MaxNumberBotsReachedException();
            }
            return this;
        }

        public Builder boardWithDimension(Board board){
            this.board = board;
            return this;
        }

        public Builder withWinningStrategies(List<WinningStrategy>winningStrategies){
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Game create(){
            Game game = new Game();
            game.setBoard(this.board);
            game.setPlayers(this.players);
            game.setWinningStrategies(this.winningStrategies);
            return game;
        }

    }
}
