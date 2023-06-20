package academy.lesson07;

public class Point3D extends Point {

    static int demention = 3;

    private int z = 1;

    static {
        demention = 0;

    }

    {
        z = -1;
        demention = 3;
    }

    public Point3D() {
//        super();
        this(0,0,0);
        System.out.println("Point3D created w/o params!");
    }

    public Point3D(int x, int y, int z) {
//        super();
        super(x, y);
        this.z = z;
        System.out.println("Point3D created with params!");
    }

    public int getZ() {
        return z;
    }

    @Override
    public double length() {
        return Math.sqrt(getX() * getX() + getY() * getY() + getZ() * getZ());
    }

    @Override
    public String toString() {
        return "(" + getX() +", " + getY() + ", " + z +")";
    }


}
