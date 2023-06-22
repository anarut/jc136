package academy.lesson08.animal;

public abstract class Animal {

    private int age;
    private String color;

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age < age) {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public abstract void voice();

    public abstract void eat();

    public void sleep() {
        System.out.println("Zzz Zzz Zzz");
    }
}
