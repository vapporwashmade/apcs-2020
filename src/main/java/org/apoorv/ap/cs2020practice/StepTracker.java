package org.apoorv.ap.cs2020practice;

public class StepTracker {
    private int totalSteps;
    private int totalDays;
    private int activeDays;
    private final int minSteps;

    public StepTracker(int minimumSteps) {
        this.totalSteps = 0;
        this.totalDays = 0;
        this.activeDays = 0;
        this.minSteps = minimumSteps;
    }

    public void addDailySteps(int steps) {
        this.totalSteps += steps;
        this.totalDays++;
        if (steps >= minSteps) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        return (totalSteps * 1.0)/totalDays;
    }
}
