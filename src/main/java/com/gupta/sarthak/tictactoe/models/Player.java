package com.gupta.sarthak.tictactoe.models;

import lombok.Getter;

@Getter
public abstract class Player {
    private Symbol symbol;
    private PlayerType playerType;

    public Player(PlayerType playerType,Symbol symbol){
        this.playerType = playerType;
        this.symbol = symbol;
    }

}
