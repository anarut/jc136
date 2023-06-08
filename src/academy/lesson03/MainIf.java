package academy.lesson03;

import java.util.Scanner;

public class MainIf {

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println("+");
        } else if (x < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }


    }
}
