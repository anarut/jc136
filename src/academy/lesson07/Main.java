package academy.lesson07;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(3, 5);
        Point point3 = new Point(7, 2);
        Point point4 = new Point(-3, 1);
        Point point5 = new Point(3, 0);

        Point[] points = {point1, point2, point3, point4, point5};

        Point pointMax = point1;
        for (Point p : points) {
            if (pointMax.length() < p.length()) {
                pointMax = p;
            }
            System.out.println(p);
        }

//        pointMax.setX(0);

        System.out.println(pointMax.getX() + " " + pointMax.getY());

        System.out.println(pointMax.toString());

        Point3D point3D1 = new Point3D();
        System.out.println(point3D1);
        Point3D point3D2 = new Point3D(3, 7, 9);
        System.out.println(point3D2);
    }
}
