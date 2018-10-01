package fundamentals.task3;

import java.text.MessageFormat;
import java.util.Map;

public class Main {
    public static void main(final String[] args) {
        final Task3 task3 = new Task3();
        try {
            final Map<Double, Double> results = task3.calculateFunction(2, 11.95F, .5F);
            results.forEach((key, value) -> {
                System.out.println(String.format("F(%f) = %f", key, value));
            });
        } catch (final Exception e) {
            System.out.println(
                    MessageFormat.format(
                            "Exception occurred: {0}",
                            e.getMessage())
            );
        }
    }
}
