package Synchronization;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    // The AtomicInteger counter provides atomic methods for thread-safe operations.
    private final AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        int newValue = counter.incrementAndGet();
        System.out.println(Thread.currentThread().getName() + " incremented counter to " + newValue);
    }

    // Retrieves the current counter value.
    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) {
        final AtomicDemo example = new AtomicDemo();
        int numberOfThreads = 10;
        // Each thread will perform 100 increments.
        int incrementsPerThread = 100;
        Thread[] threads = new Thread[numberOfThreads];
        // Create and start threads that perform increments on the atomic counter.
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    for (int j = 0; j < incrementsPerThread; j++) {
                        example.increment();
                    }
                }
            }, "Thread-" + (i + 1));
            threads[i].start();
        }
        // Wait for all threads to complete execution.
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Final counter value: " + example.getCounter());
    }
}


//Flag / Status variable → volatile
//Counter / ID generator → Atomic
//Complex logic → synchronized / Lock
