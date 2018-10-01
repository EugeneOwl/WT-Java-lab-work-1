package fundamentals.task1;

/**
 * @author e.ivanov {@link 'https://github.com/EugeneOwl'}
 */
public class Task1 {

    public double calculateFunction(final double x, final double y) {
        return ((1 + Math.sin(x + y) * Math.sin(x + y))
                /
                (2 + Math.abs(x - (2*x / (1 + x*x * y*y)))))
                + x;
    }
}
