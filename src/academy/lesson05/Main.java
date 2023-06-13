package academy.lesson05;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] ints = new int[65];
        ints[0] = 4;
        ints[1] = 6;

        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Random().nextInt(100);
        }


        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }

        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }


        for (String s : args) {
            System.out.println(s);
        }


    }
}
