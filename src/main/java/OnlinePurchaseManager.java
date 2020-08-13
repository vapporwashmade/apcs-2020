// We use default unnamed package


/*
AP ID: 1X91VY24
Initials: A.M.
*/

import java.util.ArrayList;

class Gizmo {
}

public class OnlinePurchaseManager {
    private ArrayList<Gizmo> purchases;

    public int countElectronicsByMaker(String maker) {
        int electronics = 0;
        for (Gizmo gizmo : purchases) {
            if (gizmo.getMaker().equals(maker) && gizmo.isElectronic()) {
                electronics++;
            }
        }
        return electronics;
    }

    public boolean hasAdjacentEqualPair() {
        for (int i = 0; i < purchases.size() - 1; i++) {
            if (purchases.get(i).equals(purchases.get(i + 1))) {
                return true;
            }
        }
        return false;
    }

    /**Part c)
     * The method header would be:
     * public Gizmo getCheapestGizmoByMaker(maker)
     * The Gizmo class would need to have a private double named price, which corresponds
     * to the price of the Gizmo. The constructor of the Gizmo class would be modified
     * to accept a parameter to set the price, while still being public. There would
     * also be a getPrice() method in the Gizmo class as a getter of the price of the
     * Gizmo, a public method. The OnlinePurchaseManager class would not get modified,
     * but it would work the same.
     */
}