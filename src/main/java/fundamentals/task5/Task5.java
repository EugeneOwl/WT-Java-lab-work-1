package fundamentals.task5;

import java.util.Arrays;

public class Task5 {

    /**
     *
     * @param sequence - not ordered sequence of decimals.
     * @return minimal count of elements that can be removed
     *     to get increasing sequence (IS) of given one without changing an order.
     */
    public int getCountOfRemovableElements(final int... sequence) {
        final int maxISLength = Arrays.stream(getLengthOfIncreasingSequences(sequence))
                .max().orElse(0);
        return sequence.length - maxISLength;
    }


    /**
     * Returns array of lengths of increasing sequences (IS)
     *      for each element of sequence before it inclusively.
     *
     * @param sequence - not ordered sequence of decimals.
     * @return array of lengths of increasing sequences (IS)
     *     for each element of sequence before it inclusively.
     */
    private int[] getLengthOfIncreasingSequences(final int... sequence) {
        final int[] lengthsOfISs = new int[sequence.length];
        Arrays.fill(lengthsOfISs, 1);

        for (int i = 1; i < sequence.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sequence[i] > sequence[j]
                        && lengthsOfISs[i] - 1 < lengthsOfISs[j]) {
                    lengthsOfISs[i] = lengthsOfISs[j] + 1;
                }
            }
        }
        return lengthsOfISs;
    }
}
