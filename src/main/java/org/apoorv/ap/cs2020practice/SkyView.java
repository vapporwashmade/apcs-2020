package org.apoorv.ap.cs2020practice;

public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        // check precondition: numRows > 0
        // check precondition: numCols > 0
        // check precondition: scanned.length == numRows * numCols
        this.view = new double[numRows][numCols];
        boolean reversedRow = false;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (reversedRow) {
                    this.view[i][numCols - j - 1] = scanned[i * numCols + j];
                } else {
                    this.view[i][j] = scanned[i * numCols + j];
                }
            }
            reversedRow = !reversedRow;
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        // check precondition: 0 <= startRow <= endRow < view.length
        // check precondition: 0 <= startCol <= endCol < view[0].length
        double sum = 0;
        int count = 0;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                sum += view[i][j];
                count++;
            }
        }
        return sum/count;
    }
}
