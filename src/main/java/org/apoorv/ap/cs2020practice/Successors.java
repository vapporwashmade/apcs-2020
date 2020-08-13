package org.apoorv.ap.cs2020practice;

public class Successors {
    public static Position findPosition(int num, int[][] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                if (intArr[i][j] == num) {
                    return new Position(i, j);
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] intArr) {
        Position[][] successorArray = new Position[intArr.length][intArr[0].length];
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                successorArray[i][j] = findPosition(intArr[i][j] + 1, intArr);
            }
        }
        return successorArray;
    }
}
