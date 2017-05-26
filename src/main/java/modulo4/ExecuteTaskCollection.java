package modulo4;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by JavierSainz on 5/20/17.
 */
public class ExecuteTaskCollection {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(2);
            Callable<Integer> task = () -> {
                Thread.sleep(100);
                System.out.println("Tarea 1");
                return 1;
            };

            Callable<Integer> task2 = () -> {
                Thread.sleep(10);
                System.out.println("Tarea 2");
                return 2;
            };
            List<Callable<Integer>> tasks = Arrays.asList(task, task2);
            Integer result = service.invokeAny(tasks);
            System.out.println("Reached!");
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
