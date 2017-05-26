package modulo4;

/**
 * Created by JavierSainz on 5/19/17.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SheepManager {

    private AtomicInteger sheepCount = new AtomicInteger(0);
    private Lock lock = new ReentrantLock();

    private void incrementAndReport() {
        System.out.print(" " + sheepCount.incrementAndGet());
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);

            SheepManager manager = new SheepManager();
            for (int i = 0; i < 1000; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            if (service != null) service.shutdown();
        }
    }
}