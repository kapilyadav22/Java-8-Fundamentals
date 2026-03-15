package ProducerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SharedBuffer {
    static BlockingQueue<Integer> queue =  new ArrayBlockingQueue<>(5);
}

class Producer implements Runnable {

    // for multiple producers, we can take producerId and itemsToProduce from user

    //    private final int producerId;
//    private final int itemsToProduce;
//
//    Producer(int producerId, int itemsToProduce) {
//        this.producerId = producerId;
//        this.itemsToProduce = itemsToProduce;
//    }

    @Override
    public void run() {
        try {
            int itemsToProduce = 10;
            for (int i = 1; i <= itemsToProduce; i++) {
                SharedBuffer.queue.put(i);
                System.out.println("Produced : " + i + " | Queue size: " + SharedBuffer.queue.size());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


class Consumer implements Runnable {

    // for multiple consumers, we can take consumerId and itemsToConsume from user

    //    private final int consumerId;
//    private final int itemsToConsume;
//
//    Consumer(int consumerId, int itemsToConsume) {
//        this.consumerId = consumerId;
//        this.itemsToConsume = itemsToConsume;
//    }

    @Override
    public void run() {
        try {
            int itemsToConsume = 10;
            for (int i = 1; i <= itemsToConsume; i++) {
                int item = SharedBuffer.queue.take();
                System.out.println("Consumed: " + item + " | Queue size: " + SharedBuffer.queue.size());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumerUsingBlockingQueue {
    public static void main(String[] args) {
        //Take 2 thread, one for producer, one for consumer, for multple prod/consumers increase the number of threads in fixedThreadPool
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(new Producer()); //execute takes runnable
//        executor.execute(new Producer());
        executor.execute(new Consumer());
        executor.shutdown();
    }
}
