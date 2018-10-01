package fundamentals.task7;

import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {
        final Task7 task7 = new Task7();
        final double[] arr = {1, 2, 6, 5, 4};
        task7.shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
