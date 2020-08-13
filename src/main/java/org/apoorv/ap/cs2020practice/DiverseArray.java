package org.apoorv.ap.cs2020practice;

public class DiverseArray {
    public static int arraySum(int[] arr) {
        int sum = 0;  // could be a long, what if arr[i] = Integer.MAX_VALUE or the sum is smaller than Integer.MIN_VALUE?
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr2D) {
        int length = arr2D.length;
        int[] sums = new int[length];
        for (int i = 0; i < length; i++) {
            sums[i] = arraySum(arr2D[i]);
        }
        return sums;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] arr2DSums = rowSums(arr2D);
        for (int i = 0; i < arr2DSums.length; i++) {
            for (int j = i+1; j < arr2DSums.length; j++) {
                if (arr2DSums[i] == arr2DSums[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, Integer.MAX_VALUE};
        System.out.println(arraySum(a));
    }
}
