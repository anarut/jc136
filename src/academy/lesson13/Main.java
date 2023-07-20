package academy.lesson13;

import academy.lesson07.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(2, 5));
        points.add(new Point(-2, 1));
        points.add(new Point(9, 7));
        points.add(new Point(4, 3));
        points.add(new Point(5, 6));
        points.add(new Point(0, 1));
        points.add(new Point(-3, 3));
        points.add(new Point(-1, 8));
        points.add(new Point(-2, 9));
        points.add(new Point(-3, 6));
        System.out.println(points);
//        Collections.sort(points);
        System.out.println(points);
        Collections.sort(points, new PointComparator());
        System.out.println(points);
        Collections.sort(points, new PointXComparator().thenComparing(new PointYComparator()));
        System.out.println(points);
        Collections.sort(points, new PointYComparator().thenComparing(new PointXComparator()));
        System.out.println(points);
        Collections.sort(points, new PointXComparator().thenComparing(Point::compareTo));
        System.out.println(points);
    }
}
