package academy.lesson19;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        try {
            Runnable r = () -> {
                try {
                    Thread.sleep(1000L * new Random().nextInt(5));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " finished");
            };

            for (int i = 0; i < 10; i++) {
                service.execute(r);
            }
        } finally {
            service.shutdown();
        }



    }
}
