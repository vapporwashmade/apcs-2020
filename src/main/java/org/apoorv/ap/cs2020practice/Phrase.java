package org.apoorv.ap.cs2020practice;

public class Phrase {
    private String currentPhrase;

    public Phrase(String phrase) {
        this.currentPhrase = phrase;
    }

    public void replaceNthOccurrence(String str, int n, String repl) {
        // check preconditions: str.length > 0 and repl > 0
        int occurrence = currentPhrase.findNthOccurrence(str, n);
        if (occurrence > -1) {
            currentPhrase = currentPhrase.substring(0, occurrence) + repl +
                    currentPhrase.substring(occurrence + str.length());
        }
    }

    public int findLastOccurrence(String str) {
        // check precondition: str.length > 0
        int i = 1;
        while (currentPhrase.findNthOccurrence(str, i + 1) != -1) {
            i++;
        }
        return currentPhrase.findNthOccurrence(str, i);
    }
}
