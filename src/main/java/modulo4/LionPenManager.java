package modulo4;

import java.util.concurrent.*;

/**
 * Created by JavierSainz on 5/20/17.
 */
public class LionPenManager {

    private void removeAnimals() {
        System.out.println("Removing animals");
    }

    private void cleanPen() {
        System.out.println("Cleaning the pen");
    }

    private void addAnimals() {
        System.out.println("Adding animals");
    }

    public void performTask(CyclicBarrier c1) throws BrokenBarrierException, InterruptedException, TimeoutException {
        removeAnimals();
        c1.await(100, TimeUnit.MILLISECONDS);
        cleanPen();
        c1.await(100, TimeUnit.MILLISECONDS);
        addAnimals();
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            LionPenManager manager = new LionPenManager();
            CyclicBarrier c1 = new CyclicBarrier(4);
            for (int i = 0; i < 4; i++)
                service.submit(() -> {
                    try {
                        manager.performTask(c1);
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (TimeoutException e) {
                        e.printStackTrace();
                    }
                });
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
