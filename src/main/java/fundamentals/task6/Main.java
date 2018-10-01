package fundamentals.task6;

import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {
        final Task6 task6 = new Task6();
        final double[][] matrix = task6.getSquareMatrix(1, 2, 3, 4);
        for (final double[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
