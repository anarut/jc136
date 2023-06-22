package academy.lesson08.animal.fish;

public class Shark extends Fish {

    public static final String COLOR = "Gray";
    public static final boolean HUNTER = true;

    private int toothCount;

    public Shark(int age, int toothCount) {
        super(age, COLOR, HUNTER);
        this.toothCount = toothCount;
    }

    public int getToothCount() {
        return toothCount;
    }

    @Override
    public void eat() {
        if (toothCount > 0) {
            toothCount--;
            System.out.println("eating fresh meat");
        } else {
            System.out.println("No tooth. Can't eat");
        }

    }
}
