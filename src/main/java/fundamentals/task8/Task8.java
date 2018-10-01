package fundamentals.task8;

import java.util.Arrays;

public class Task8 {
    public int[] findInsertIndexes(
            final double[] sequenceA,
            final double[] sequenceB
    ) {
        final int[] indexesOfInsertions = new int[sequenceB.length];

        for (int i = 0; i < sequenceB.length; i++) {
            final int insertIndex = Arrays.binarySearch(sequenceA, sequenceB[i]);
            if(insertIndex >= 0){
                indexesOfInsertions[i] = insertIndex + 1;
            } else{
                indexesOfInsertions[i] = -(insertIndex) - 1;
            }
        }
        return indexesOfInsertions;
    }
}
