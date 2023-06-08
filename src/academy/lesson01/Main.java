package academy.lesson01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("what is your name?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello " +  scanner.next());

        int i = 2022_2023;

        short val = 32323;

        float f = 10f;

        byte g = (byte) f;

        int h = 210;
        byte h1 = (byte) h;
        System.out.println(h1);

    }
}
