package modulo4;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/**
 * Created by JavierSainz on 5/20/17.
 */
class Order implements Runnable {
    String name;

    Order(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name);
    }
}

public class Hotel implements Executor {
    final Queue<Runnable> custQueue = new ArrayDeque<>();

    public void execute(Runnable r) {
        synchronized (custQueue) {
            custQueue.offer(r);
        }
        processEarliestOrder();
    }

    private void processEarliestOrder() {
        synchronized (custQueue) {
            Runnable task = custQueue.poll();
            task.run();
        }
    }

    public static void main(String args[]) {
        Hotel hotel = new Hotel();
        hotel.execute(new Order("tea"));
        hotel.execute(new Order("coffee"));
        hotel.execute(new Order("burger"));
    }
}