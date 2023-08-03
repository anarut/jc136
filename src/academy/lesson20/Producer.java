package academy.lesson20;

public class Producer implements SuperRunnable {

    private final String name;
    private final Store store;
    private final int numbersOfItems;
    private final int delay;

    public Producer(String name, Store store, int numbersOfItems, int delay) {
        this.name = name;
        this.store = store;
        this.numbersOfItems = numbersOfItems;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 0; i < numbersOfItems; i++) {
            store.addItem();
            ThreadUtil.delay(delay);
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
