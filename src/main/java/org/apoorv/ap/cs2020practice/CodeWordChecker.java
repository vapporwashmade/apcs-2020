package org.apoorv.ap.cs2020practice;

public class CodeWordChecker implements StringChecker {
    private int minLength;
    private int maxLength;
    private String excluding;

    public CodeWordChecker(String ex) {
        this(6, 20, ex);
    }

    public CodeWordChecker(int min, int max, String ex) {
        minLength = min;
        maxLength = max;
        excluding = ex;
    }

    @Override
    public boolean isValid(String string) {
        return string.length() >= minLength && string.length() <= maxLength && string.indexOf(excluding) < 0;
    }
}
