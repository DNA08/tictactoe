package com.gupta.sarthak.tictactoe;

import com.gupta.sarthak.tictactoe.controller.GameController;
import com.gupta.sarthak.tictactoe.exception.SymbolAlreadyInUseException;
import com.gupta.sarthak.tictactoe.factory.player.PlayerFactory;
import com.gupta.sarthak.tictactoe.models.Game;
import com.gupta.sarthak.tictactoe.models.Symbol;
import com.gupta.sarthak.tictactoe.models.User;
import com.gupta.sarthak.tictactoe.strategies.CornerWinningStrategy;
import com.gupta.sarthak.tictactoe.strategies.NormalWinningStrategy;
import com.gupta.sarthak.tictactoe.strategies.RandomPlayingStrategy;
import com.gupta.sarthak.tictactoe.strategies.WinningStrategy;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        GameController gameController = new GameController();
        com.gupta.sarthak.tictactoe.models.Board board = new com.gupta.sarthak.tictactoe.models.Board(3);
        List<com.gupta.sarthak.tictactoe.models.Player>players = null;
        try {
            players = List.of(PlayerFactory.addHumanPlayer(new Symbol('X'),new User()),
                    PlayerFactory.addBot(new Symbol('O'),new RandomPlayingStrategy()));
        } catch (SymbolAlreadyInUseException e) {
            throw new RuntimeException(e);
        }
        List<WinningStrategy>strategies = List.of(new CornerWinningStrategy(),new NormalWinningStrategy());
        Game game1 = gameController.createGame(board,players,strategies);
        gameController.move(game1);
        System.out.println(game1);

    }
}
