package fundamentals.task2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class Task2Test {
    private final Task2 task2 = new Task2();
    private final Point point;
    private final boolean doesBelong;

    public Task2Test(final Point point, final boolean doesBelong) {
        this.point = point;
        this.doesBelong = doesBelong;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        final Object[][] data = {
                {new Point(2, 2), true},
                {new Point(4, 5), true},
                {new Point(-4, 5), true},
                {new Point(-6, 0), true},
                {new Point(5, -1), true},
                {new Point(-5, -3), true},
                {new Point(-5, -4), false},
                {new Point(-6, -4), false},
                {new Point(5, 1), false},
        };
        return Arrays.asList(data);
    }

    @Test
    public void test() {
        assertEquals(task2.doesPointBelongToArea(point), doesBelong);
    }
}
