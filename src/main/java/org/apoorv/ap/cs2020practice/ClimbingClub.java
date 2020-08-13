package org.apoorv.ap.cs2020practice;

import java.util.List;

public class ClimbingClub {
    private List<ClimbInfo> climbList;

    public void addClimb(String peakName, int climbTime) {
        climbList.add(new ClimbInfo(peakName, climbTime));
    }

    public void addClimbv2(String peakName, int climbTime) {
        for (int i = 0; i < climbList.size(); i++) {
            if (climbList.get(i).getName().compareTo(peakName) < 0) {
                climbList.add(i, new ClimbInfo(peakName, climbTime));
            }
        }
    }
}
// i: NO
// ii: YES
