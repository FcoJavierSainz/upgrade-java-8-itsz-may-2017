package modulo4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by JavierSainz on 5/20/17.
 */
public class FinishAllTasks {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            // Add tasks to the thread executor
            service.submit(() -> 30 + 11);
            Future<Integer> result  = service.submit(() -> {
                Thread.sleep(1000);
                return 40 + 11;
            });
            result.cancel(true);
        } finally {
            if (service != null) service.shutdown();
        }
        if (service != null) {
            try {
                service.awaitTermination(100, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Check whether all tasks are finished

            if (service.isTerminated())
                System.out.println("All tasks finished");
            else
                System.out.println("At least one task is still running");
        }
    }
}
