package org.apoorv.ap.cs2020practice;

public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount) {
        currentPlayer = (int) (Math.random() * playerCount);
        this.board = new int[playerCount];
        for (int i = 0; i < playerCount; i++) {
            this.board[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public void distributeCurrentPlayerTokens() {
        // check precondition: current player tokens >= 1
        int tokens = board[currentPlayer];
        board[currentPlayer] = 0;
        for (int i = currentPlayer + 1; tokens > 0; i++) {
            if (i >= board.length) {
                i = 0;
            }
            board[i]++;
            tokens--;
        }
    }
}
