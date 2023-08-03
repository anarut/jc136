package academy.lesson20;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<Integer> callable = () -> {
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName() + " --- " + i + " sec");
                Thread.sleep(1000L);
            }
            System.out.println("finished");
            return new Random().nextInt(100);
        };

        Future<Integer> future = service.submit(callable);
//        while (!future.isDone()) {
//            System.out.println("wait 3 secs");
//            Thread.sleep(3000L);
//            System.out.println("result is ready?");
//        }


        try {
            Integer result = future.get(4, TimeUnit.SECONDS);
            System.out.println(result);
        } catch (TimeoutException e) {
            e.printStackTrace();
            future.cancel(true);
        }

        service.shutdown();
    }
}
