package academy.lesson20;

public class ThreadUtil {

    public static void delay(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException ignored) {}
    }
}
