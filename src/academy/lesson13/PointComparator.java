package academy.lesson13;

import academy.lesson07.Point;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        int v1 = Math.abs(o1.getX()) + Math.abs(o1.getY());
        int v2 = Math.abs(o2.getX()) + Math.abs(o2.getY());
        return Integer.compare(v1, v2);
    }
}
