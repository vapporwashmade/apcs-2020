package org.apoorv.ap.cs2020practice;

public class LightBoard {


    private final boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        this.lights = new boolean[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                double probability = Math.random();
                if (probability <= 0.4) {
                    lights[i][j] = true;
                } else {
                    lights[i][j] = false;
                }
            }
        }
    }

    public boolean evaluateLight(int row, int col) {
        boolean lightOn = lights[row][col];
        int lightsOnInCol = 0;
        for (int i = 0; i < lights.length; i++) {
            if (lights[i][col]) {
                lightsOnInCol++;
            }
        }
        if (lightOn) {
            if (lightsOnInCol % 2 == 0) {
                return false;
            }
        } else {
            if (lightsOnInCol % 3 == 0) {
                return true;
            }
        }
        return lightOn;
    }
}
