package academy.lesson08.animal.earth;

import academy.lesson08.Speakable;

public class Human extends EarthAnimal implements Speakable {

    public Human(int age, String color) {
        super(age, color);
    }

    @Override
    public void voice() {
        System.out.println("I can tell you something");
    }

    @Override
    public void eat() {
        System.out.println("Eating chips and drink beer");
    }

    @Override
    public void run() {
        System.out.println("Running with speed 15km/hour");
    }

    public void watchVideos() {
        System.out.println("I like waisting time");
    }

    public void study() {
        System.out.println("So hard");
    }

    @Override
    public void speak() {
        System.out.println("Yo Yo");
    }
}
