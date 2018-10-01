package fundamentals.task8;

import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {
        final Task8 task8 = new Task8();
        final double[] sequenceA = {1, 3, 5};
        final double[] sequenceB = {0, 4, 6};
        System.out.println(Arrays.toString(
                task8.findInsertIndexes(sequenceA, sequenceB)
        ));
    }
}
