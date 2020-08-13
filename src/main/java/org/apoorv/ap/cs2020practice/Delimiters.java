package org.apoorv.ap.cs2020practice;

import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delimiters = new ArrayList<>();
        for (String token : tokens) {
            if (token.equals(openDel) || token.equals(closeDel)) {
                delimiters.add(token); // returns a boolean which we ignore
            }
        }
        return delimiters;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int openCount = 0;
        int closeCount = 0;
        for (String delimiter : delimiters) {
            if (openDel.equals(delimiter)) {
                openCount++;
            } else if (closeDel.equals(delimiter)) {
                closeCount++;
            } else {
                // decide what to do
            }
            if (closeCount > openCount) {
                return false;
            }
        }
        return openCount == closeCount;
    }
}
