package org.apoorv.ap.cs2020practice;

public class GrayImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues;

    public int countWhitePixels() {
        int whitePixels = 0;
        for (int i = 0; i < pixelValues.length; i++) {
            for (int j = 0; j < pixelValues[i].length; j++) {
                if (pixelValues[i][j] == WHITE) {
                    whitePixels++;
                }
            }
        }
        return whitePixels;
    }

    public void processImage() {
        for (int i = 0; i < pixelValues.length; i++) {
            for (int j = 0; j < pixelValues[i].length; j++) {
                if (i + 2 > pixelValues.length || j + 2 > pixelValues[i].length) {
                    continue;
                }
                pixelValues[i][j] -= pixelValues[i + 2][j + 2];
                if (pixelValues[i][j] < BLACK) {
                    pixelValues[i][j] = BLACK;
                }
            }
        }
    }
}
