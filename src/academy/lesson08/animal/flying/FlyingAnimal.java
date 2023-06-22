package academy.lesson08.animal.flying;

import academy.lesson08.animal.Animal;

public abstract class FlyingAnimal extends Animal {

    public FlyingAnimal(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println("Eating worms");
    }

    public void fly() {
        System.out.println("I can fly everywhere");
    }
}
