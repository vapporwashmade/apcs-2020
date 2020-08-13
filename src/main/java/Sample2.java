// We use default unnamed package


/*
AP ID: 1X91VY24
Initials: A.M.
*/

public class Sample2 {
    public static boolean isValid(int numWithCheckDigit) {
        if (getCheck(numWithCheckDigit/10) == numWithCheckDigit % 10) {
            return true;
        } else {
            return false;
        }
    }

    /** Part b)
     I would include a private int invalidCheck in the CheckDigit class to keep track
     of how many times an incorrect isValid call is made. I would modify the isValid
     method to increment the invalidCheck variable right before it returns false, in
     the case that the if condition does not come out to be true. The method header
     and other features of isValid would remain the same.
     */
}
