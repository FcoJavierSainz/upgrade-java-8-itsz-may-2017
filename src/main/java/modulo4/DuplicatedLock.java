package modulo4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by JavierSainz on 5/19/17.
 */
public class DuplicatedLock {
    public static void main(String[] args) {
        int count = 0;
        Lock lock = new ReentrantLock(true);
        try {
            lock.lock();
            lock.lock();
            ++count;
        } finally {
            lock.unlock();
            lock.unlock();
        }

        new Thread(() -> {
            if(lock.tryLock()) {
                try {
                    System.out.println("Acquired");
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Unavailable");
            }
        }).start();

        //Anytime you see a Lock object on the exam, make sure that it calls unlock() the same number of times that it calls lock().
    }
}
