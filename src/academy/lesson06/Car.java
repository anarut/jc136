package academy.lesson06;

import java.time.LocalDate;

public class Car {

    static int numberOfWheels = 4;
    String color;
    private int price;
    String type;
    double weight;
    double height;
    LocalDate created;

    public Car() {

    }

    public Car(String col, int price) {
        color = col;
        this.price = price;
    }

    public Car(String color, int price, String type,
               double weight, double height, LocalDate created) {
        this.color = color;
        this.price = price;
        this.type = type;
        this.weight = weight;
        this.height = height;
        this.created = created;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("RED", 2000);
        Car car2 = new Car("BLACK", 5000);
        Car car3 = new Car("BLUE", 3333, "sedan", 3200.23, 2.03, LocalDate.of(1999, 5, 3));

        System.out.println();

        car1.setPrice(-1000);

    }
}
