package com.gupta.sarthak.tictactoe.exception;

public class SymbolAlreadyInUseException extends Exception {
    public SymbolAlreadyInUseException(Character symbol){
        super("Symbol "+symbol+" is already taken by some other player");
    }
}
