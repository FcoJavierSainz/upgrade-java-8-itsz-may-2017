package modulo4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by JavierSainz on 5/19/17.
 */
public class LockComparision {
    public static void main(String[] args) {
        int count = 0;
        // Implementation #1 with synchronization
        Object object = new Object();
        synchronized (object) {
            System.out.print(" " + (++count));
        }

// Implementation #2 with a Lock
        Lock lock = new ReentrantLock();
        try {
            lock.lock();
            System.out.print(" " + (++count));
        } finally {
            lock.unlock();
        }
    }
}
