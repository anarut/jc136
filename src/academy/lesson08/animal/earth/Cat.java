package academy.lesson08.animal.earth;

public class Cat extends EarthAnimal {

    private boolean bold = false;

    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat(int age, String color, boolean bold) {
        super(age, color);
        this.bold = bold;
    }

    public boolean isBold() {
        return bold;
    }

    @Override
    public void run() {
        System.out.println("Running with speed 27km/hour");
    }

    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("love wiskas");
    }
}
