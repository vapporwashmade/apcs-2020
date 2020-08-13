package org.apoorv.ap.cs2020practice;

public class Crossword {
    private Square[][] puzzle;

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
        return blackSquares[r][c];
    }

    public Crossword(boolean[][] blackSquares) {
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int currentNum = 1;
        for (int i = 0; i < blackSquares.length; i++) {
            for (int j = 0; j < blackSquares[i].length; j++) {
                if (toBeLabeled(i, j, blackSquares)) {
                    puzzle[i][j] = new Square(false, currentNum);
                    currentNum++;
                } else {
                    puzzle[i][j] = new Square(true, 0);
                }
            }
        }
    }
}
