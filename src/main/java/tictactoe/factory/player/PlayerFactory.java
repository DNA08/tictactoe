package com.gupta.sarthak.tictactoe.factory.player;

import com.gupta.sarthak.tictactoe.models.*;
import com.gupta.sarthak.tictactoe.strategies.BotPlayingStrategy;

public class PlayerFactory {

    public static Player addHumanPlayer(Symbol symbol, User user){
        return new HumanPlayer(symbol,user);
    }

    public static Player addBot(Symbol symbol, BotPlayingStrategy botPlayingStrategy){
        return new BotPlayer(symbol, botPlayingStrategy);
    }
}
