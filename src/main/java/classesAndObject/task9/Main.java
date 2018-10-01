package classesAndObject.task9;

import java.text.MessageFormat;

public class Main {
    public static void main(final String[] args) {
        final Ball blueBall = new Ball(10, Color.BLUE);
        final Ball blueBall2 = new Ball(15, Color.BLUE);
        final Ball redBall = new Ball(20, Color.RED);
        final Ball greenBall = new Ball(30, Color.GREEN);

        final Basket basket = new Basket()
                .addBall(blueBall)
                .addBall(blueBall2)
                .addBall(redBall)
                .addBall(greenBall);

        System.out.println(
                MessageFormat.format(
                        "General balls weight in basket = {0}",
                        basket.getBallsWeight()
                )
        );
        System.out.println(
                MessageFormat.format(
                        "Count of blue balls = {0}",
                        basket.getBallsCountByColor(Color.BLUE)
                )
        );
    }
}
