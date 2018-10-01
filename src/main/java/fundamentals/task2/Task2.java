package fundamentals.task2;

import java.awt.*;

/**
 * @author e.ivanov {@link 'https://github.com/EugeneOwl'}
 */
public class Task2 {
    /*
    2 | 1
    -----
    3 | 4
     */
    private final Point area[] = new Point[4];

    {
        area[0] = new Point(4, 5);   // 1st quarter
        area[1] = new Point(-4, 5);  // 2nd quarter
        area[2] = new Point(-6, -3); // 3rd quarter
        area[3] = new Point(6, -3);  // 4th quarter
    }

    public boolean doesPointBelongToArea(final Point point) {
        if (point.y > 0) { // 1st or 2nd quoter
            if (point.x >= 0) { // 1nd quoter or x == 0
                return point.x <= area[0].x
                        && point.y <= area[0].y;
            } else { // 2st quoter
                return point.x >= area[1].x
                        && point.y <= area[1].y;
            }
        } else { // 3rd or 4th quoter (or y == 0 because x goes longer here)
            if (point.x >= 0) { // 4th quoter or x == 0
                return point.x <= area[3].x
                        && point.y >= area[3].y;
            } else { // 3rd quoter
                return point.x >= area[2].x
                        && point.y >= area[2].y;
            }
        }
    }
}
