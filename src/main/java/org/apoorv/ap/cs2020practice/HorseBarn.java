package org.apoorv.ap.cs2020practice;

public class HorseBarn {
    private Horse[] spaces;

    public int findHorseSpace(String name) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void consolidate() {
        int spaceToFill = 0;
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null) {
                spaces[spaceToFill] = spaces[i];
                spaceToFill++;
            }
        }
        for (int i = spaceToFill; i < spaces.length; i++) {
            spaces[i] = null;
        }
    }
}
