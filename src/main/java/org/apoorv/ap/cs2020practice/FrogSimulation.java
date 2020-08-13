package org.apoorv.ap.cs2020practice;

public class FrogSimulation {
    private final int goalDistance;
    private final int maxHops;
    // Constructor
    public FrogSimulation(int dist, int nhops) {
        if (dist <= 0) {
            throw new IllegalArgumentException("invalid distance: " + dist + ", must be > 0");
        }
        if (nhops <= 0) {
            throw new IllegalArgumentException("invalid number of hops: " + nhops + ", must be > 0");
        }
        this.goalDistance = dist;
        this.maxHops = nhops;
    }
    public boolean simulate() {
        int pos = 0;
        int hops = 0;
        while (pos < goalDistance) {
            if (pos < 0) {
                return false;
            }
            if (hops >= maxHops) {
                return false;
            }
            pos += hopDistance();
            hops++;
        }
        return true;
    }
    public boolean sim1() {
        int pos = 0;
        for (int i = 0; i < maxHops; i++) {
            pos += hopDistance();
        }
        return pos >= goalDistance;
    }

    public double runSimulations(int num) {
        int trueCount = 0;
        boolean reachedGoal = false;
        for (int i = 0; i < num; i++) {
            reachedGoal = simulate();
            if (reachedGoal == true) {
                trueCount++;
            }
        }
        return (trueCount * 1.0 / num); // we do _not_ want integer division!
    }
}
