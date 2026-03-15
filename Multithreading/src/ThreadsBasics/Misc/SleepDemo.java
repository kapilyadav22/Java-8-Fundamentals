package ThreadsBasics.Misc;

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("Thread is going to sleep...");
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        System.out.println("Thread woke up after sleeping.");
    }
}

//sleep() does NOT release any locks, meaning other threads can't access synchronized resources during sleep.