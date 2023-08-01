package academy.lesson19;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < n; i++) {
                counter.inc();
            }
        };

        for (int i = 0; i < 3; i++) {
            new Thread(r).start();
        }
    }

    public static class Counter {
        Integer count = 0;

        public void inc() {
            Integer a = 1;

            synchronized (Counter.class) {
            int c = get();
            c = c + 1;
            count = c;

            System.out.printf("%s --- %s%n", Thread.currentThread().getName(), count);


             }
        }

        public synchronized int get() {
            return count;
        }

        public synchronized static void anotherMethod() {
            Counter.anotherMethod();
        }
    }
}
