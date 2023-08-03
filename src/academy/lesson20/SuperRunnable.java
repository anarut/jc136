package academy.lesson20;

public interface SuperRunnable extends Runnable {

    String getName();

    default int complexity() {
        return 1;
    }
}
