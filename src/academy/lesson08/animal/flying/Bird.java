package academy.lesson08.animal.flying;

public abstract class Bird extends FlyingAnimal {

    private String colorFeather;

    public Bird(int age, String color, String colorFeather) {
        super(age, color);
        this.colorFeather = colorFeather;
    }

    public String getColorFeather() {
        return colorFeather;
    }

}
