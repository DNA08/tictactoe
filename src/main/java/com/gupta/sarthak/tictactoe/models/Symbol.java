package com.gupta.sarthak.tictactoe.models;

import com.gupta.sarthak.tictactoe.exception.SymbolAlreadyInUseException;

import java.util.HashSet;

public class Symbol {
    Character symbol;

    private static final HashSet<Character> symbolSet = new HashSet<>();

    public Symbol(char c) throws SymbolAlreadyInUseException {

        if(symbolSet.contains(c)){
            throw new SymbolAlreadyInUseException(c);
        }
        symbolSet.add(c);
        this.symbol = c;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "symbol=" + symbol +
                '}';
    }
}
