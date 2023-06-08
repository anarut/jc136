package academy.lesson04;

public class Main2 {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int f = 0; f < 13; f++) {
            System.out.print(a + b + " ");
            int c = a + b;
            a = b;
            b = c;

        }

        System.out.println();

        for (int i = 0; i < 25; i++) {
            System.out.print(fibbo(i) + " ");
        }

    }

    public static int fibbo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibbo(n - 1) + fibbo(n - 2);
    }

}
