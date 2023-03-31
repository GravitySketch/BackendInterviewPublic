package com.gs.interviews.models;

import java.util.Optional;

public class TicTacToeGame {

    private final int boardSize;
    private final String[][] board;

    public TicTacToeGame() {
        this(3);
    }

    public TicTacToeGame(int boardSize) {
        this.boardSize = boardSize;
        this.board = new String[boardSize][boardSize];
    }

    public boolean takePosition(String playerId, int positionX, int positionY) {

        board[positionY][positionY] = playerId;
        return true;
    }

    public boolean isInGame(String playerId) {
        return true;
    }

    public boolean joinPlayer(String playerId) {
        return true;
    }

    public Optional<String> getWinnerId() {
        for (var i = 0; i < boardSize; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][0].equals((board[i][2]))) {
                return Optional.of(board[i][0]);
            }
        }

        for (var i = 0; i < boardSize; i++) {
            if (board[0][i].equals(board[1][i]) && board[0][i].equals((board[i][2]))) {
                return Optional.of(board[i][0]);
            }
        }

        return Optional.empty();
    }
}
