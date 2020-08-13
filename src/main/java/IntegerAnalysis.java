// We use default unnamed package


/*
AP ID: 1X91VY24
Initials: A.M.
*/

public class IntegerAnalysis {
    public static double analyzeInts(int max, int n) {
        // check precondition: max > 0, n > 0
        int countValid = 0;
        for (int i = 0; i < n; i++) {
            int value = getInt();
            if (value > 0 && value < max && value % 3 == 0) {
                countValid++;
            }
        }
        return (countValid * 1.0) / n;
    }

    /** Part b)
     There needs to be a private int divisibilityCheck, which is initialized in the constructor. The
     constructor will accept a parameter divisor, which will initialize divisibilityCheck to divisor.
     The constructor will remain public. There must be a getter, public int getDivisibilityCheck, that
     returns the value that divisibilityCheck has, and there must be a setter, public void setDivisibilityCheck(int divisor),
     which will set the value of divisibilityCheck to divisor. The method analyzeInts would check for
     divisibility of divisibilityCheck, rather than 3, in the if condition inside the for loop by changing
     that statement to look like value > 0 && value < max && value % divisibilityCheck == 0. The signature
     of analyzeInts would remain the same.
     */
}
