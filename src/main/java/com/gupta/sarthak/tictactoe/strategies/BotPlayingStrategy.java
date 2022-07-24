package com.gupta.sarthak.tictactoe.strategies;

import com.gupta.sarthak.tictactoe.models.Board;
import com.gupta.sarthak.tictactoe.models.Move;
import com.gupta.sarthak.tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move nextMove(Player player, Board board);
}
