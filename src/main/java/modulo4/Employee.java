package modulo4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by JavierSainz on 5/19/17.
 */
class Bus {
    Lock lock = new ReentrantLock();

    public void boardBus(String name) {
        System.out.println(name + ": boarded");
    }
}

public class Employee extends Thread {
    Bus bus;
    String name;

    Employee(String name, Bus bus) {
        this.bus = bus;
        this.name = name;
    }

    public void run() {
        try {
            bus.lock.lockInterruptibly();
            try {
                bus.boardBus(name);
            } finally {
                bus.lock.unlock();
            }
        } catch (InterruptedException e) {
            System.out.println(name + ": Interrupted!!");
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String args[]) {
        Bus bus = new Bus();
        Employee e1 = new Employee("Paul", bus);
        e1.start();
        e1.interrupt();
        Employee e2 = new Employee("Shreya", bus);
        e2.start();
    }
}