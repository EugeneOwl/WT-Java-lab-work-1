package fundamentals.task4;

import java.util.Arrays;

public class Task4 {

    private boolean isNatural(final int n) {
        int var = 2;
        while (true) {
            if (n > 1) {
                if (n % var != 0) {
                    var++;
                } else {
                    return n == var;
                }
            } else {
                return false;
            }
        }
    }

    public int[] getNaturalOnes(final int[] arr) {
        return Arrays.stream(arr)
                .filter(this::isNatural).toArray();
    }
}
