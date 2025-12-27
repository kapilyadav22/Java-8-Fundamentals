package ThreadsDemo;

class MyThread5 implements Runnable{
     static int counter = 0;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThread5());
        Thread t2 = new Thread(new MyThread5());
        t1.start();
        t2.start();
//        t1.join();
//        t2.join();
//        Thread.sleep(1);
        System.out.println("counter value is "+ MyThread5.counter);

    }
}
