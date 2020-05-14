// We use default unnamed package


/*
AP ID: 1X91VY24
Name: Apoorv Mhaswade
*/

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
        // check precondition
        StringBuilder hint = new StringBuilder();
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == Character.toLowerCase(word.charAt(i))) {
                hint.append(word.charAt(i));
            } else if (word.indexOf(guess.charAt(i)) > -1) {
                hint.append("+");
            } else {
                hint.append("*");
            }
        }
        return hint.toString();
    }

    public static void main(String[] args) {
        HiddenWord h = new HiddenWord("EXAMS");
        System.out.println(h.getHint("MEALS"));
        System.out.println(h.getHint("eeeee"));
        System.out.println(h.getHint("edams"));
        System.out.println(h.getHint("exams"));
    }
}
