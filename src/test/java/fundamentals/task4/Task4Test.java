package fundamentals.task4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;

@RunWith(Parameterized.class)
public class Task4Test {
    private final Task4 task4 = new Task4();
    private final int[] arr;
    private final int[] naturalOnes;

    public Task4Test(final int[] arr, final int[] naturalOnes) {
        this.arr = arr;
        this.naturalOnes = naturalOnes;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        final int[][][] data = {
                {{-2, 2, 0, 1, 5557, 5553, 21}, {2, 5557}},
                {{-100, 100, 0, 1, 19, 17}, {19, 17}},
                {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {2, 3, 5, 7}}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testGetNaturalOnes() {
        Assert.assertArrayEquals(task4.getNaturalOnes(arr), naturalOnes);
    }
}
