package academy.lesson20;

public class Store {

    private final int maxCount;
    private int count = 0;

    public Store(int maxCount) {
        this.maxCount = maxCount;
    }

    public synchronized void addItem() {
        while (count == maxCount) {
            waitFor();
        }

        count++;
        System.out.printf("%s --- ADD --- current count: %s%n", Thread.currentThread().getName(), count);

        notifyAll();
    }


    public synchronized void removeItem() {
        while (count == 0) {
            waitFor();
        }

        count--;

        System.out.printf("%s --- REMOVE --- current count: %s%n", Thread.currentThread().getName(), count);

        notifyAll();
    }



    public void waitFor() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
