package org.apoorv.ap.cs2020practice;

public class ArrayTester {
    public static int[] getColumn(int[][] arr2D, int c) {
        if (c > arr2D[0].length) {
            throw new IllegalArgumentException("invalid column index: " + c + ", must be valid column number");
        }
        int[] column = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            column[i] = arr2D[i][c];
        }
        return column;
    }

    public static boolean isLatin(int[][] square) {
        if (containsDuplicates(square[0])) {
            return false;
        }
        for (int i = 0; i < square.length; i++) {
            if (!hasAllValues(square[0], square[i]) ||  !hasAllValues(square[0], getColumn(square, i))) {
                return false;
            }
        }
        return true;
    }
}
