package academy.lesson13;

import academy.lesson07.Point;

import java.util.Comparator;

public class PointYComparator implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        return Integer.compare(o1.getY(), o2.getY());
    }
}
