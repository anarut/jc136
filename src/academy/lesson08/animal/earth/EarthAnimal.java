package academy.lesson08.animal.earth;

import academy.lesson08.animal.Animal;

public abstract class EarthAnimal extends Animal {

    public static final int DEFAULT_LEGS = 4;

    private int legs = DEFAULT_LEGS;

    public EarthAnimal(int age, String color) {
        this(age, color, DEFAULT_LEGS);
    }

    public EarthAnimal(int age, String color, int legs) {
        super(age, color);
        this.legs = legs;
    }

    public abstract void run();

}
