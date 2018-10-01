package fundamentals.task3;

import org.junit.Test;

import java.util.TreeMap;

import static junit.framework.TestCase.assertEquals;

public class Task3Test {
    private final Task3 task3 = new Task3();
    private float a;
    private float b;
    private float h;
    private TreeMap<Double, Double> results;

    @Test
    public void testCalculateFunction() {
        a = 0;
        b = 1;
        h = .2F;
        results = new TreeMap<>();
        results.put(0.0, 0.0);
        results.put(0.20000000298023224, 0.20271003861136652);
        results.put(0.4000000059604645, 0.42279322576408374);
        results.put(0.6000000089406967, 0.6841368214670212);
        results.put(0.800000011920929, 1.0296385816093323);
        results.put(1.0000000149011612, 1.5574077756991116);
        assertEquals(task3.calculateFunction(a, b, h), results);
    }
}
