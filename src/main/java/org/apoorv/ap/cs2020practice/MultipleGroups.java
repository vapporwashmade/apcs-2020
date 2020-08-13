package org.apoorv.ap.cs2020practice;

import java.util.List;

public class MultipleGroups implements NumberGroup {
    private List<NumberGroup> groupList;

    public MultipleGroups(List<NumberGroup> groupList) {
        this.groupList = groupList;
    }

    @Override
    public boolean contains(int number) {
        for (int i = 0; i < groupList.size(); i++) {
            if (groupList.get(i).contains(number)) {
                return true;
            }
        }
        return false;
    }
}
