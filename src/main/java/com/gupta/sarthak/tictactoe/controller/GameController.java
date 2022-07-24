package com.gupta.sarthak.tictactoe.controller;

import com.gupta.sarthak.tictactoe.models.*;
import com.gupta.sarthak.tictactoe.strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game createGame(Board board, List<Player> players, List<WinningStrategy> strategies) {
        Game game = null;
        try{
             game = Game.buildGame()
                    .boardWithDimension(board)
                    .addPlayers(players)
                    .withWinningStrategies(strategies)
                    .create();
        }catch (Exception e){
            e.printStackTrace();
        }
        return game;
    }

    public void move(Game game){
        if(game.getState().equals(State.IN_PROGRESS)){
            int currentPlayerIndex = game.getLastPlayerIndex();

        }
    }
}
