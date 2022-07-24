package com.gupta.sarthak.tictactoe.models;

import com.gupta.sarthak.tictactoe.strategies.BotPlayingStrategy;

public class BotPlayer extends Player implements BotPlayingStrategy {

    private BotPlayingStrategy playingStrategy;

    public BotPlayer(Symbol symbol, BotPlayingStrategy botPlayingStrategy) {
        super(PlayerType.BOT, symbol);
        this.playingStrategy = botPlayingStrategy;
    }

    @Override
    public Move nextMove(Player player, Board board) {
        return null;
    }
}
