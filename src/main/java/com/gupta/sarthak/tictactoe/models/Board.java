package com.gupta.sarthak.tictactoe.models;

import java.util.List;

public class Board {
    private List<List<Cell>>board;
    private int dimension;

    public Board(int dimension){
        this.dimension = dimension;
    }
}
