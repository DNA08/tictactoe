package com.gupta.sarthak.tictactoe.models;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

public class HumanPlayer extends Player{
    private Symbol symbol;
    private User user;

    public HumanPlayer(Symbol symbol, User user){
        super(PlayerType.HUMAN,symbol);
    }
}
