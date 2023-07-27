package academy.lesson18;

public class ThreadMain {

    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);
        System.out.println();
        currentThread.getState();



        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        };


        Thread thread = new Thread(r);
        thread.setDaemon(true);
        thread.start();

        Thread thread1 = new Thread(r);
        thread1.setDaemon(true);
        thread1.start();


        thread.run();
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Thread.currentThread().interrupt();
        boolean interrupted = Thread.currentThread().isInterrupted();
        try {
            Thread.sleep(11);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
