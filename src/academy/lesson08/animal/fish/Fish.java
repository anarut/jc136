package academy.lesson08.animal.fish;

import academy.lesson08.animal.Animal;

public abstract class Fish extends Animal {

    private boolean hunter = false;

    public Fish(int age, String color, boolean hunter) {
        super(age, color);
        this.hunter = hunter;
    }

    public Fish(int age, String color) {
        super(age, color);
    }

    public boolean isHunter() {
        return hunter;
    }

    @Override
    public void voice() {
        System.out.println("bul bul");
    }

    public void swim() {
        System.out.println("swim like a pro");
    }

    @Override
    public void sleep() {
        if (getAge() > 2) {
            System.out.println("I can't sleep. I need food");
            eat();
        } else {
            super.sleep();
        }
    }
}
