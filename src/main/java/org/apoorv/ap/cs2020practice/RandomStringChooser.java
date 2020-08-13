package org.apoorv.ap.cs2020practice;

import java.util.ArrayList;
import java.util.List;

public class RandomStringChooser {
    private List<String> strings;

    public RandomStringChooser(String[] stringArray) {
        this.strings = new ArrayList<>();
        for (String s : stringArray) {
            this.strings.add(s);
        }
    }

    public String getNext() {
        if (strings.size() == 0) {
            return "NONE";
        }
        int index = (int) (Math.random() * strings.size());
        String next = strings.get(index);
        strings.remove(index);
        return next;
    }
}
