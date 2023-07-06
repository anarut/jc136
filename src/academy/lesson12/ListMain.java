package academy.lesson12;

import academy.lesson07.Point;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(2,3));
        points.add(new Point(5, 7));
        System.out.println(points);
        points.add(1, new Point(3,3));
        System.out.println(points);
        points.add(0, new Point(-1, 4));
        System.out.println(points);
        System.out.println(points.size());
        points.remove(2);
        System.out.println(points);
    }
}
