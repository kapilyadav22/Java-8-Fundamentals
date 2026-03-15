package ThreadsBasics.Misc;

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread " + Thread.currentThread().getName()+ "is running");
    }
}

public class Start_vs_run {
    public static void main(String[] args) {
    Thread thread1 = new MyThread();
    thread1.start(); // Starts a new thread

    // Can we call the start() method twice on the same Thread object?
    // thread1.start(); Throws IllegalThreadStateException

    Thread thread2 = new MyThread();
    thread2.run();  // Runs in the main thread
    }
}


/*
What is thread safety and how can it be achieved?
Thread safety refers to code that functions correctly during simultaneous execution by multiple threads.
It can be achieved through
synchronization,
immutable objects,
concurrent collections,
atomic variables, and
thread-local variables.
 */
