package ProducerConsumer;

import java.util.concurrent.Semaphore;

class SharedBuffer3 {
    private final int[] buffer;
    private int count = 0;

    private final Semaphore empty;
    private final Semaphore full;
    private final Semaphore mutex;

    SharedBuffer3(int size) {
        buffer = new int[size];
        empty = new Semaphore(size); // initially all slots empty
        full = new Semaphore(0);     // initially no items
        mutex = new Semaphore(1);    // binary semaphore
    }

    public void produce(int item) throws InterruptedException {
        empty.acquire();   // wait for empty slot
        mutex.acquire();   // lock buffer

        buffer[count++] = item;
        System.out.println("Produced: " + item);

        mutex.release();   // unlock
        full.release();    // signal consumer
    }

    public int consume() throws InterruptedException {
        full.acquire();    // wait for item
        mutex.acquire();   // lock buffer

        int item = buffer[--count];
        System.out.println("Consumed: " + item);

        mutex.release();   // unlock
        empty.release();   // signal producer
        return item;
    }
}

class Producer3 implements Runnable {
    private final SharedBuffer3 buffer;

    Producer3(SharedBuffer3 buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.produce(i);
                Thread.sleep(400);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer3 implements Runnable {
    private final SharedBuffer3 buffer;

    Consumer3(SharedBuffer3 buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.consume();
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumerUsingSemaphores {
    public static void main(String[] args) {
        SharedBuffer3 buffer = new SharedBuffer3(5);

        new Thread(new Producer3(buffer)).start();
        new Thread(new Consumer3(buffer)).start();
    }
}
