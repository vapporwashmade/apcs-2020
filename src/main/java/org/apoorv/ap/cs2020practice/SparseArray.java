package org.apoorv.ap.cs2020practice;

import java.util.ArrayList;
import java.util.List;

public class SparseArray {
    private int numRows;
    private int numCols;
    private List<SparseArrayEntry> entries;

    public SparseArray() {
        this.entries = new ArrayList<SparseArrayEntry>();
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public int getValueAt(int row, int col) {
        // check precondition
        for (SparseArrayEntry entry : entries) {
            if (entry.getRow() == row && entry.getCol() == col) {
                return entry.getValue();
            }
        }
        return 0;
    }

    public void removeCol(int col) {
        for (int i = 0; i < entries.size(); i++) {
            SparseArrayEntry entry = entries.get(i);
            if (entry.getCol() > col) {
                entries.set(i, new SparseArrayEntry(entry.getRow(), entry.getCol() - 1, entry.getValue()));
            } else if (entry.getCol() == col) {
                entries.remove(entry);
            }
        }
        numCols--;
    }
}
