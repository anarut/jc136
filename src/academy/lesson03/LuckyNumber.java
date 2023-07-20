package academy.lesson03;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LuckyNumber {

    /*
     * asdasd
     */
    public static void main(String[] args) {
        // [-10; 10]

        //int random = (int)(Math.random() * 21 - 10); // [-10; 10]

        int r = (int)(Math.random() * 99 + 1); // [0; 100)

        game(r);

    }

    public static void game(int res) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();

            if (x > res) {
                System.out.println("меньше"); // 1
                game(res);
            } else if (x == res) {
                System.out.println("угадал"); // 2
            } else {
                System.out.println("больше"); // 3
                game(res);
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число! Попробуйте еще раз");
            game(res);
//        } finally {
//            System.out.println("ok");
        }
    }


    public static void game2(int res) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x == res) {
            System.out.println("угадал"); // 1
        } else {
            System.out.println(x > res ? "меньше" : "больше");

//            String s = x > res ? "меньше" : "больше";
//            System.out.println(s);

//            if (x > res) {
//                System.out.println("меньше"); // 2
//            } else {
//                System.out.println("больше"); // 3
//            }
            game(res);
        }
    }
}
