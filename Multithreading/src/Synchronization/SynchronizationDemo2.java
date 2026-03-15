package Synchronization;

class Counter {
    private int counter=0;

    int getCounter(){
        return counter;
    }
    synchronized void incrementCounter(){
        counter++;
    }
}

class CounterThread implements Runnable{
    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
    for (int i = 0; i < 10; i++) {
        counter.incrementCounter();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    }
}

public class SynchronizationDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CounterThread counterThread = new CounterThread(counter);
        Thread t1 = new Thread(counterThread);
        Thread t2 = new Thread(counterThread);
        t1.start();
        t2.start();
//        t1.join();
//        t2.join();
        Thread.sleep(10);
        System.out.println(counter.getCounter());
    }
}
