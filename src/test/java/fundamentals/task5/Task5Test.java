package fundamentals.task5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class Task5Test {
    private final Task5 task5 = new Task5();
    private final int[] sequence;
    private final int removableElementsCount;

    public Task5Test(final int[] sequence, final int removableElementsCount) {
        this.sequence = sequence;
        this.removableElementsCount = removableElementsCount;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        final int[] sequence1 = {5, 7, 5, 4, 4, 4, 0};
        final int[] sequence2 = {1, 2, 3, 4, 5};
        final int[] sequence3 = {2, 3, 4, -100, -100, 5};
        final Object[][] data = {
                {sequence1, 5},
                {sequence2, 0},
                {sequence3, 2}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testGetCountOfRemovableElements() {
        assertEquals(task5.getCountOfRemovableElements(sequence), removableElementsCount);
    }
}
