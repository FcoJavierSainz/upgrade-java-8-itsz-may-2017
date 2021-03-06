package modulo4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by JavierSainz on 5/19/17.
 */
public class LockTest {
    Lock myLock = new ReentrantLock();
    List<String> values = new ArrayList<>();

    public void addValue(String value) {
        //code here using locks
    }

    public static void main(String[] args) {
        LockTest lock = new LockTest();
        Runnable r = () -> {
            for (int i = 0; i < 2; i++) {
                lock.addValue(Thread.currentThread().getName() + ", " + i);
            }
            System.out.println(lock.values);
        };
        new Thread(r).start();
        new Thread(r).start();
    }
}