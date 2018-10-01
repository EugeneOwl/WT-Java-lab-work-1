package fundamentals.task4;

import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {
        final Task4 task4 = new Task4();
        final int[] arr = {-2, 2, 0, 1, 5557, 5553, 21};
        Arrays.stream(task4.getNaturalOnes(arr)).forEach(System.out::println);
    }
}
