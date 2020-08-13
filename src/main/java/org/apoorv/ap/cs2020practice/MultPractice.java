package org.apoorv.ap.cs2020practice;

public class MultPractice implements StudyPractice {
    private int integer1, integer2;

    public MultPractice(int int1, int int2) {
        this.integer1 = int1;
        this.integer2 = int2;
    }

    @Override
    public void nextProblem() {
        this.integer2++;
    }

    @Override
    public String getProblem() {
        return integer1 + " TIMES " + integer2;
    }
}