package academy.lesson06;

public class Main {

    public static int a = 1;
    protected static int b = 2;
    static int c = 3;
    private static int d = 4;

    public static void main(String[] args) {
        int a = Main.a;
        int d = Main.d;
        int c = Main.c;
        int b = Main.b;
    }
}
