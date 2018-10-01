package classesAndObject.task9;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Ball> balls = new ArrayList<>();

    public Basket addBall(final Ball ball) {
        balls.add(ball);
        return this;
    }

    public double getBallsWeight() {
        return this.balls.stream().mapToDouble(Ball::getWeight).sum();
    }

    public long getBallsCountByColor(final Color color) {
        return this.balls.stream()
                .filter(it -> it.getColor().equals(color))
                .count();
    }
}
