package academy.lesson04;

public class Main {
    public static void main(String[] args) {


        for (int i = 1; i <= 9; i++) {
            System.out.printf("5 *%2d =%3d\n", i, 5 * i);
        }

        System.out.println();

        for (int i = 1; i < 10000; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        int m = 4;
        int n = 3;

        for (int c = 0; c < m; c++) {
            for (int x = 0; x < n; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();

        int l = 7;
        for (int c = 0; c < l; c++) {
            for (int x = 0; x <= c; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
