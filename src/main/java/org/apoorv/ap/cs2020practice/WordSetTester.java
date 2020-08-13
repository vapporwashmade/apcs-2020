package org.apoorv.ap.cs2020practice;

public class WordSetTester {
    public static int countA(WordSet s) {
        int count = 0;
        for (int i = 0; i < s.size(); i++) {
            if (s.findkth(i).substring(0, 1).compareTo("A") < 0) {
                return count;
            }
            count++;
        }
        return count;
    }

    public static void removeA(WordSet s) {

    }
}
