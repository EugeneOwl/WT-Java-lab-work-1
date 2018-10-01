package fundamentals.task1;

import java.text.MessageFormat;

public class Main {
    public static void main(final String[] args) {
        final Task1 task1 = new Task1();
        final double x = -12;
        final double y = 3.4;

        System.out.println(MessageFormat.format(
                "Calculating function result for x = {0} and y = {1}",
                x,
                y
        ));
        System.out.println(MessageFormat.format(
                "Result = {0}",
                task1.calculateFunction(x, y))
        );
    }
}
