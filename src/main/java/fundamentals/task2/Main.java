package fundamentals.task2;

import java.awt.*;
import java.text.MessageFormat;

public class Main {
    public static void main(final String[] args) {
        final Task2 task2 = new Task2();
        final Point point = new Point(4, 5);

        System.out.println(MessageFormat.format(
                "Point ({0}, {1}) DOES{2} belong to the area.",
                point.x,
                point.y,
                task2.doesPointBelongToArea(point) ? "" : " NOT"
        ));
    }
}
