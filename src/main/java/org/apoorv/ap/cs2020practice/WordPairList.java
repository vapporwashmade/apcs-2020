package org.apoorv.ap.cs2020practice;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    /**
     * Constructs a new instance of WordPairList from the given array of words.
     *
     * @param words
     */
    public WordPairList(String[] words) {
        int nWords = words.length;
        allPairs = new ArrayList<>(nWords);
        if (nWords < 2) {
            throw new IllegalArgumentException("invalid word list (should have >=2 words), has: " + nWords);
        }
        for (int i = 0; i < nWords; i++) {
            for (int j = i + 1; j < nWords; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    public int numMatches() {
        int matches = 0;
//        for (int i = 0; i < allPairs.size(); i++) {
//            if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())) {
//                matches++;
//            }
//        }
        for (WordPair w : allPairs) {
            if (w.getFirst().equals(w.getSecond())) {
                matches++;
            }
        }
        return matches;
    }
}
