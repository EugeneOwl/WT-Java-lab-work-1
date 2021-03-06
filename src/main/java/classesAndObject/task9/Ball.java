package classesAndObject.task9;

/**
 * @author e.ivanov {@link 'https://github.com/EugeneOwl'}
 */
public class Ball {
    private final double weight;
    private final Color color;

    public Ball(final double weight, final Color color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }
}
