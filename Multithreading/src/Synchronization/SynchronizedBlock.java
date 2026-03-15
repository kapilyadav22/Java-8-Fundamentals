package Synchronization;


class Counter2 {
    private int count = 0;
    private final Object lock = new Object(); // explicit lock object

    public void increment() {
        synchronized (lock) {  
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

class Mythread extends Thread {
    private final Counter2 counter;

    Mythread(Counter2 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) throws InterruptedException {
        Counter2 counter = new Counter2();

        Thread t1 = new Mythread(counter);
        Thread t2 = new Mythread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}

