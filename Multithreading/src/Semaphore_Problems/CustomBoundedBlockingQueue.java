package Semaphore_Problems;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

class BoundedBlockingQueue {

    // Number of available items to consume
    private final Semaphore availableItems;

    // Number of available empty slots
    private final Semaphore availableSlots;

    private final ConcurrentLinkedDeque<Integer> deque;

    public BoundedBlockingQueue(int capacity) {
        this.availableItems = new Semaphore(0);
        this.availableSlots = new Semaphore(capacity);
        this.deque = new ConcurrentLinkedDeque<>();
    }

    // Adds an element, blocks if queue is full
    public void enqueue(int element) throws InterruptedException {
        availableSlots.acquire();     // wait for empty slot
        deque.addFirst(element);
        availableItems.release();     // signal item available
    }

    // Removes an element, blocks if queue is empty
    public int dequeue() throws InterruptedException {
        availableItems.acquire();     // guarantees an item exists
        int value = deque.pollLast();
        availableSlots.release();     // signal empty slot
        return value;
    }

    // Current size (non-blocking)
    public int size() {
        return deque.size();
    }
}


public class CustomBoundedBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        BoundedBlockingQueue queue = new BoundedBlockingQueue(3);

        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.enqueue(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        executorService.execute(() -> {
            try {
                for (int i = 1; i <= 2; i++) {
                    int value = queue.dequeue();
                    System.out.println("Consumed: " + value);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
            Thread.sleep(10);
            System.out.println("Queue size is : "+ queue.size());
        }

        /*
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.enqueue(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    int value = queue.dequeue();
                    System.out.println("Consumed: " + value);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
         */
    }
}

