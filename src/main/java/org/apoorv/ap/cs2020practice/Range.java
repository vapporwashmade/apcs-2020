package org.apoorv.ap.cs2020practice;

public class Range implements NumberGroup {
    private int minValue;
    private int maxValue;

    public Range(int min, int max) {
        this.minValue = min;
        this.maxValue = max;
    }

    @Override
    public boolean contains(int number) {
        return number >= minValue && number <= maxValue;
    }
}
