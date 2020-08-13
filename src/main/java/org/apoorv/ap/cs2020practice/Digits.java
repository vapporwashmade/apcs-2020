package org.apoorv.ap.cs2020practice;

import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        // check precondition: num >= 0
        this.digitList = new ArrayList<>();
        while (num > 0) {
            this.digitList.add(num % 10);
            num /= 10;
        }
    }

    public boolean isStrictlyIncreasing() {
        for (int i = 1; i < digitList.size(); i++) {
            if (digitList.get(i) > digitList.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

}
