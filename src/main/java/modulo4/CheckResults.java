package modulo4;

import java.util.concurrent.*;

/**
 * Created by JavierSainz on 5/20/17.
 */
public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) CheckResults.counter++;
            });
            result.get(10, TimeUnit.MICROSECONDS);
            result.isCancelled();
            System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            if (service != null) service.shutdown();
        }
    }
}