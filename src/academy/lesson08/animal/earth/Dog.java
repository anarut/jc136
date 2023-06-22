package academy.lesson08.animal.earth;

public class Dog extends EarthAnimal {

    private boolean bold = false;
    private boolean trainable = true;

    public Dog(int age, String color, boolean bold, boolean trainable) {
        super(age, color);
        this.bold = bold;
        this.trainable = trainable;
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public boolean isBold() {
        return bold;
    }

    public boolean isTrainable() {
        return trainable;
    }

    @Override
    public void voice() {
        System.out.println("wow wow");
    }

    @Override
    public void eat() {
        System.out.println("Like bones");
    }

    @Override
    public void run() {
        System.out.println("Running with speed 25km/hour");
    }
}
