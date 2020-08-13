package org.apoorv.ap.cs2020practice;

import java.util.ArrayList;
import java.util.List;

public class StringFormatter {
    public static int totalLetters(List<String> wordList) {
        int letters = 0;
        for (int i = 0; i < wordList.size(); i++) {
            letters += wordList.get(i).length();
        }
        return letters;
    }

    public static int basicGapWidth(List<String> wordList, int formattedLen) {
        int numOfGaps = wordList.size()-1;
        // first finds the amount of spaces the formatted string has by formattedLen - totalLetters(wordList)
        // then does integer divison by numOfGaps to find the basic gap length
        // ignores the leftover spaces
        // because the amount of spaces has to be split between the number of gaps
        return (formattedLen - totalLetters(wordList))/numOfGaps;
    }

    public static String format(List<String> wordList, int formattedLen) {
        int leftover = leftoverSpaces(wordList, formattedLen);
        int basicGap = basicGapWidth(wordList, formattedLen);
        StringBuilder formatBuilder = new StringBuilder();
        for (int i = 0; i < wordList.size(); i++) {
            formatBuilder.append(wordList.get(i));
            for (int j = 0; j < basicGap; j++) {
                formatBuilder.append(" ");
            }
        }
        int i = 0;
        while (leftover > 0) {
            int addAfter = formatBuilder.indexOf(wordList.get(i)) + wordList.get(i).length();
            formatBuilder.insert(addAfter + 1, " ");
            leftover--;
            i++;
            if (i > wordList.size()) {
                i = 0;
            }
        }
        return formatBuilder.toString();
    }

    private static int leftoverSpaces(List<String> wordList, int formattedLen) {
        int baseGapWidth = basicGapWidth(wordList, formattedLen);
        int numOfGaps = wordList.size()-1;
        return (formattedLen - (totalLetters(wordList) + (numOfGaps * baseGapWidth)));
    }

    public static void main(String[] args) {
        List<String> wordList1 = new ArrayList<>();
        List<String> wordList2 = new ArrayList<>();
        List<String> wordList3 = new ArrayList<>();
        wordList1.add("AP");
        wordList1.add("COMP");
        wordList1.add("SCI");
        wordList1.add("ROCKS");
        wordList2.add("GREEN");
        wordList2.add("EGGS");
        wordList2.add("AND");
        wordList2.add("HAM");
        wordList3.add("BEACH");
        wordList3.add("BALL");
        System.out.println(format(wordList1, 20));
        System.out.println(format(wordList2, 20));
        System.out.println(format(wordList3, 20));
    }
}
