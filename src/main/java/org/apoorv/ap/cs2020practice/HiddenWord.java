package org.apoorv.ap.cs2020practice;

public class HiddenWord {
    private final String word;
    public HiddenWord(String hiddenWord) {
        this.word = hiddenWord;
    }

    public String getHintInefficient(String guess) {
        // check precondition
        String hint = "";
        for (int i = 0; i < guess.length(); i++) {
            String guessChar = guess.substring(i, i + 1);
            if (guessChar.equals(word.substring(i, i + 1))) {
                hint += guessChar;
            } else if (word.indexOf(guessChar) > -1) {
                hint += "+";
            } else {
                hint += "*";
            }
        }
        return hint;
    }

    /**
     *
     * @param guess
     * @return
     */
    public String getHint(String guess) {

    }
}
