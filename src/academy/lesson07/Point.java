package academy.lesson07;

public class Point {

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

//    @Override
//    public String toString() {
//        return "Point{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
//    }
}
