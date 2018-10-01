package fundamentals.task7;

public class Task7 {
    public void shellSort(final double... arr) {
        int limit = 0;
        while (limit < arr.length - 1) {
            if (arr[limit] <= arr[limit + 1]) { // is everything before limit already sorted
                limit++;
            } else {
                swap(arr, limit, limit + 1);
                if (limit > 0) {
                    limit--;
                }
            }
        }
    }

    private void swap(
            final double[] arr,
            final int i,
            final int j
    ) {
        final double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
