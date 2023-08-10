package academy.lesson22;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        if (new Random().nextBoolean()) {
            Singleton singleton1 = Singleton.getInstance();
            Singleton singleton2 = Singleton.getInstance();
            System.out.println(singleton1);
            System.out.println(singleton2);
        } else {
            System.out.println("nothing");
        }
        System.out.println("start");
    }
}
