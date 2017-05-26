package modulo4;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by JavierSainz on 5/18/17.
 */
public class TestBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(2);
        Thread producer = new Thread(() -> {
            try {
                queue.put("1");
                Thread.sleep(1000);
                queue.put("2");
                Thread.sleep(1000);
                queue.put("3");
                System.out.println(queue.offer("3"));
                System.out.println(queue.offer("3"));
                System.out.println(queue.offer("3"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                System.out.println(queue.take());
                System.out.println(queue.poll(100, TimeUnit.MILLISECONDS));
                System.out.println(queue.take());
                System.out.println(queue.take());
                System.out.println(queue.poll());
                System.out.println(queue.poll());
                System.out.println(queue.poll());
                System.out.println(queue.poll());
                System.out.println(queue.poll());
                System.out.println(queue.poll());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producer.start();
        consumer.start();
    }
}
