package academy.lesson08.animal.flying;

public class Dove extends Bird {

    public Dove(int age, String color, String colorFeather) {
        super(age, color, colorFeather);
    }

    @Override
    public void voice() {
        System.out.println("kurlik");
    }

    public void poop() {
        System.out.println("car marked!");
    }
}
