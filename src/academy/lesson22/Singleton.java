package academy.lesson22;

import academy.lesson22.Singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("singleton class created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
