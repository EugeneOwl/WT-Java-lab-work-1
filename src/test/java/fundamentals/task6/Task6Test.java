package fundamentals.task6;

import org.junit.Assert;
import org.junit.Test;

public class Task6Test {
    private final Task6 task6 = new Task6();

    @Test
    public void testGetSquareMatrix() {
        final double[][] matrix = {
                {1, 2, 3, 4},
                {2, 3, 4, 1},
                {3, 4, 1, 2},
                {4, 1, 2, 3},
        };
        Assert.assertArrayEquals(task6.getSquareMatrix(1, 2, 3, 4), matrix);
    }

    @Test
    public void testGetSquareMatrixLittle() {
        final double[][] matrix2 = {
                {1, 2},
                {2, 1}
        };
        Assert.assertArrayEquals(task6.getSquareMatrix(1, 2), matrix2);
    }
}
