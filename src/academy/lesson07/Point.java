package academy.lesson07;

public class Point implements Comparable<Point> {


    //x^2 + y^2
    //|x| + |y|
    // x    y
    // y    x
    private int x;
    private int y;

    public Point() {
//        super();  - добавляется по умолчанию
        System.out.println("Point created!");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Point created with params!");
    }

        public int getX() {
            return x;
        }

//    public void setX(int x) {
//        this.x = x;
//    }

    public int getY() {
        return y;
    }

//    public void setY(int y) {
//        this.y = y;
//    }

    public double length() {
//        double sqrt = Math.sqrt(x * x + y * y);
//        return sqrt;
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "(" + x +", " + y + ")";
    }

    @Override
    public int compareTo(Point p) {
        int v1 = x * x + y * y;
        int v2 = p.x * p.x + p.y * p.y;
//        if (v1 == v2) {
//            return 0;
//        } else if (v1 > v2) {
//            return 1;
//        } else {
//            return -1;
//        }

//        return v1 == v2 ? 0 : v1 > v2 ? 1 : -1;

        return Integer.compare(v1, v2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (getX() != point.getX()) return false;
        return getY() == point.getY();
    }

    @Override
    public int hashCode() {
        int result = getX();
        result = 31 * result + getY();
        return result;
    }

    //    @Override
//    public String toString() {
//        return "Point{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
//    }
}
