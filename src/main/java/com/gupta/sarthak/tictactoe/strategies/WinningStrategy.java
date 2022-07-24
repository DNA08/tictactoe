package com.gupta.sarthak.tictactoe.strategies;

import com.gupta.sarthak.tictactoe.models.Board;
import com.gupta.sarthak.tictactoe.models.Cell;

public interface WinningStrategy {
    Boolean ifWin(Board board,Cell cell);
}
