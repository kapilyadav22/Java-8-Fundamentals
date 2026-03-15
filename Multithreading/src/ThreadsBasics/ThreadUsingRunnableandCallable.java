package ThreadsBasics;

import java.util.concurrent.Callable;

class MyRunnable implements Runnable {
    private Callable<String> callable;
    public MyRunnable(Callable<String> callable) {
        this.callable = callable;
    }

    public void run() {
        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            System.out.println("exception : "+ e);
        }
    }
}

public class ThreadUsingRunnableandCallable {
    public static void main(String[] args) {

    Callable<String> callable = new MyCallable("task 1");
    Runnable myRunnable = new MyRunnable(callable);
    Thread t1 = new Thread(myRunnable);
    t1.start();
    }
}

/*
Q. Can you use Callable with standard Thread objects?
Answer: No, you cannot directly use Callable with the Thread class.
Callable is designed to work with the ExecutorService framework.
 Thread class only accepts Runnable objects. However, you can adapt a Callable to work with
Thread by creating a Runnable that executes the Callable and stores its result:
 */
