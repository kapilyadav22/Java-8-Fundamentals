package ProducerConsumer;

/*
Producer Consumer problem can be solve using multiple approaches:
1.) Using Wait/Notify(All) (good for interviews)
2.) Using Blocking Queue (Best approach for interviews/production)
3.) Using Lock (Reentrant Lock ) + conditions (only if asked)
4.) Using Semaphores (only if asked)
 */

import java.util.LinkedList;
import java.util.Queue;
public class ProducerConsumerUsingWaitNotify {
    // Shared buffer and its capacity
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int CAPACITY = 5;

    // Method for the producer thread that adds items to the buffer.
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                // Wait while the buffer is full.
                while (buffer.size() == CAPACITY) {
                    System.out.println("Buffer is full. Producer is waiting...");
                    wait();
                }
                // Once there is space, produce an item.
                System.out.println("Producer produced: " + value);
                buffer.offer(value++);
                // Notify all waiting threads (consumers) that a new item is available.
                notifyAll();
            }
            // Sleep for a short time to simulate production time.
            Thread.sleep(1000);
        }
    }

    // Method for the consumer thread that takes items from the buffer.
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                // Wait while the buffer is empty.
                while (buffer.isEmpty()) {
                    System.out.println("Buffer is empty. Consumer is waiting...");
                    wait();
                }
                // Once there is an item, consume it.
                int value = buffer.poll();
                System.out.println("Consumer consumed: " + value);
                // Notify all waiting threads (producers) that space is available.
                notifyAll();
            }
            // Sleep for a short time to simulate consumption time.
            Thread.sleep(1500);
        }
    }

    // Main method to run the producer-consumer example.
    public static void main(String[] args) {
        ProducerConsumerUsingWaitNotify pc = new ProducerConsumerUsingWaitNotify();
        // Creating the producer thread.
        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Producer thread interrupted.");
            }
        }, "ProducerThread");

        // Creating the consumer thread.
        Thread consumerThread = new Thread(new Runnable() {
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Consumer thread interrupted.");
                }
            }
        }, "ConsumerThread");

        // Start both threads.
        producerThread.start();
        consumerThread.start();
    }
}


