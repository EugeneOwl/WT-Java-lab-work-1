package classesAndObjects.task9;

import classesAndObject.task9.Ball;
import classesAndObject.task9.Basket;
import classesAndObject.task9.Color;
import org.junit.Assert;
import org.junit.Test;

public class TestBasketWithBallsIntegration {
    @Test
    public void testBasketGetBallsWeight() {
        final Ball blueBall = new Ball(10, Color.BLUE);
        final Ball blueBall2 = new Ball(15, Color.BLUE);
        final Ball redBall = new Ball(20, Color.BLUE);
        final Ball greenBall = new Ball(30, Color.BLUE);

        final Basket basket = new Basket()
                .addBall(blueBall)
                .addBall(blueBall2)
                .addBall(redBall)
                .addBall(greenBall);

        Assert.assertEquals(basket.getBallsWeight(), 75, 0);
    }

    @Test
    public void testBasketGetBallsCountByColor() {
        final Ball blueBall = new Ball(0, Color.BLUE);
        final Ball blueBall2 = new Ball(0, Color.BLUE);
        final Ball redBall = new Ball(0, Color.RED);
        final Ball greenBall = new Ball(0, Color.GREEN);

        final Basket basket = new Basket()
                .addBall(blueBall)
                .addBall(blueBall2)
                .addBall(redBall)
                .addBall(greenBall);

        Assert.assertEquals(basket.getBallsCountByColor(Color.BLUE), 2);
    }
}
