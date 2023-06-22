package academy.lesson08.animal.fish;

public class GoldFish extends Fish {

    public static final String COLOR = "Gold";
    public static final int DEFAULT_NUMBER_OF_WISHES = 3;

    private int wishes = DEFAULT_NUMBER_OF_WISHES;

    public GoldFish(int age, int wishes) {
        super(age, COLOR);
        this.wishes = wishes;
    }

    public GoldFish(int age) {
        super(age, COLOR);
    }

    public int getWishes() {
        return wishes;
    }

    @Override
    public void eat() {
        System.out.println("Eating grass");
    }

    public void doWish(String wish) {
        if (wishes > 0) {
            wishes--;
            System.out.println("your wish '" + wish + "' is done - " + wishes + " left");
        } else {
            System.out.println("I cant make it in real. No wishes for you!");
        }
    }
}
