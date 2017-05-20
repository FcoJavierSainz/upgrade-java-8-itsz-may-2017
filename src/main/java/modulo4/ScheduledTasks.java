package modulo4;

import java.util.concurrent.*;

/**
 * Created by JavierSainz on 5/20/17.
 */
public class ScheduledTasks {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";

        Future<?> result1 = service.schedule(task1, 3, TimeUnit.SECONDS);
        Future<?> result2 = service.schedule(task2, 1, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(task1,5,1,TimeUnit.SECONDS);

    }
}
