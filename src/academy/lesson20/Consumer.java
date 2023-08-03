package academy.lesson20;

public class Consumer implements SuperRunnable {

    private final String name;
    private final Store store;
    private final int numbersOfItems;
    private final int delay;

    public Consumer(String name, Store store, int numbersOfItems, int delay) {
        this.name = name;
        this.store = store;
        this.numbersOfItems = numbersOfItems;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 0; i < numbersOfItems; i++) {
            store.removeItem();
            ThreadUtil.delay(delay);
        }
    }

    public Store getStore() {
        return store;
    }

    public int getNumbersOfItems() {
        return numbersOfItems;
    }

    public int getDelay() {
        return delay;
    }

    @Override
    public String getName() {
        return name;
    }
}
