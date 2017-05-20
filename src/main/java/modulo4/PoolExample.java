package modulo4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by JavierSainz on 5/20/17.
 */
public class PoolExample {
    ExecutorService service = Executors.newFixedThreadPool(5);

    public void orderFood(FoodOrder order) {
        service.submit(order);
    }

    public void hotelClosedForDay() {
        service.shutdown();
    }

    public void hotelClosedForever() {
        try {
            if (!service.awaitTermination(60, TimeUnit.SECONDS)) {
                service.shutdownNow();
            }
            if (!service.awaitTermination(60, TimeUnit.SECONDS))
                System.err.println("Pool did not terminate");
        } catch (InterruptedException ie) {
            service.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        PoolExample pool = new PoolExample();
        pool.orderFood(new FoodOrder("berry"));
        pool.orderFood(new FoodOrder("Eggs"));
        pool.orderFood(new FoodOrder("Beans"));
        pool.hotelClosedForever();
    }
}

class FoodOrder implements Callable<Void> {
    String name;

    FoodOrder(String name) {
        this.name = name;
    }

    public Void call() throws Exception {

        System.out.println(name);
        if (name.equalsIgnoreCase("berry"))
            throw new Exception("Berry unavailable");
        return null;
    }
}
