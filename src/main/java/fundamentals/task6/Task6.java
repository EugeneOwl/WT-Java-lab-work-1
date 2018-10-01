package fundamentals.task6;

public class Task6 {
    public double[][] getSquareMatrix(final double... sequence) {
        final double[][] matrix = new double[sequence.length][sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            System.arraycopy(sequence, 0, matrix[i], 0, sequence.length);
            shiftArrayToRight(sequence);
        }
        return matrix;
    }

    private void shiftArrayToRight(final double... sequence) {
        if (sequence.length == 0) {
            return;
        }
        final double firstOne = sequence[0];
        System.arraycopy(sequence, 1, sequence, 0, sequence.length - 1);
        sequence[sequence.length - 1] = firstOne;
    }
}
