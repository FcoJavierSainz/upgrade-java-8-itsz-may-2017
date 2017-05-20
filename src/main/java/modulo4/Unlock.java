package modulo4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by JavierSainz on 5/19/17.
 */
public class Unlock {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        //lock.unlock();  // Throws IllegalMonitorStateException at runtime

        // Syntax #1: lock() inside try/finally
        try {
            lock.lock();
            // Implementation details
        } finally {
            lock.unlock();
        }

        // Syntax #2: lock() outside try/finally
        lock.lock();
        try {
            // Implementation details
        } finally {
            lock.unlock();
        }
    }
}
