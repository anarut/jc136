package academy.lesson08.animal.flying;

import academy.lesson08.Speakable;

public class Parrot extends Bird implements Speakable {

    public Parrot(int age, String color, String colorFeather) {
        super(age, color, colorFeather);
    }

    @Override
    public void voice() {
        System.out.println("I can speak like a human");
    }

    @Override
    public void speak() {
        System.out.println("Hello human bags");
    }

}
