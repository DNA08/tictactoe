package com.gupta.sarthak.tictactoe.exception;

import com.gupta.sarthak.constant.TicTacToeConstants;

public class MaxNumberBotsReachedException extends Exception {

    public MaxNumberBotsReachedException(){
        super("Bots can't be more than "+ TicTacToeConstants.NO_OF_BOTS);
    }

}
