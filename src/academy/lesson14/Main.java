package academy.lesson14;

import academy.lesson07.Point;
import academy.lesson13.PointComparator;
import academy.lesson13.PointXComparator;
import academy.lesson13.PointYComparator;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Point> objects = new TreeSet<>(new PointComparator()
                        .thenComparing(new PointXComparator()
                        .thenComparing(new PointYComparator())));
        objects.add(new Point(0, 6));
        objects.add(new Point(0, -6));
        objects.add(new Point(1, 9));
        objects.add(new Point(4, 2));
        objects.add(new Point(4, 6));
        objects.add(new Point(5, 4));
        objects.add(new Point(3, 4));

        Point p = null;
        int y = p.getY();

        System.out.println(objects);
    }
}
