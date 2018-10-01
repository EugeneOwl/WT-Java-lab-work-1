package fundamentals.task5;

import java.text.MessageFormat;

public class Main {
    public static void main(final String[] args) {
        final Task5 task5 = new Task5();
        System.out.println(
                MessageFormat.format(
                        "Minimal count of elements to remove is {0}",
                        task5.getCountOfRemovableElements(5, 7, 5, 4, 4, 4, 0)
                )
        );
    }
}
