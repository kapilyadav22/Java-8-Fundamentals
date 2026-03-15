package ProducerConsumer;

//Using ReentrantLock + Condition (ADVANCED)


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.*;

class SharedBuffer2 {
    private final int[] buffer = new int[5];
    private int count = 0;

    private final Lock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public void produce(int item) throws InterruptedException {
        lock.lock();
        try {
            while (count == buffer.length) {
                notFull.await();
            }
            buffer[count++] = item;
            System.out.println("Produced: " + item);
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public void consume() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) {
                notEmpty.await();
            }
            int item = buffer[--count];
            System.out.println("Consumed: " + item);
            notFull.signal();
         //   return item;
        } finally {
            lock.unlock();
        }
    }
}

class Producer2 implements Runnable {

    private final SharedBuffer2 buffer;

    Producer2(SharedBuffer2 buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.produce(i);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer2 implements Runnable {

    private final SharedBuffer2 buffer;

    Consumer2(SharedBuffer2 buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.consume();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


public class ProducerConsumerUsingRentrantLock {
    public static void main(String[] args) {
        //Take 2 thread, one for Producer, one for Consumer, for multiple prod/Consumers increase the number of threads in fixedThreadPool
        SharedBuffer2 buffer = new SharedBuffer2();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new Producer2(buffer));
        executor.execute(new Consumer2(buffer));
        executor.shutdown();
    }
}
