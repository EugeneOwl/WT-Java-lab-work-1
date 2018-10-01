package fundamentals.task1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class Task1Test {
    private final Task1 task1 = new Task1();
    private final double x;
    private final double y;
    private final double f;

    public Task1Test(final double x, final double y, final double f) {
        this.x = x;
        this.y = y;
        this.f = f;
    }

    @Parameterized.Parameters
    public static Collection<Double[]> data() {
        final Double[][] data = {
                {0.0 ,0.0, 0.5},
                {100D, -100D, 100.00980392176086},
                {10D, 5D, 10.118651925910761}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testCalculateFunction() {
        assertEquals(task1.calculateFunction(x, y), f, 0.000001);
    }
}
