package ThreadsBasics.Misc;

class SharedResource {

    synchronized void waitExample(){
        System.out.println(Thread.currentThread().getName() + " is waiting...");
        try {
            wait();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " resumed after notify.");
    }

    synchronized void notifyExample(){
        System.out.println("Notifying a waiting thread...");
        notify(); // Wakes up one waiting thread
    }
}

class WaitExample {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        //Thread(Runnable target, String name)
        Thread t1 = new Thread(()->sharedResource.waitExample(),"Thread 1");

        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResource.notifyExample();
        },"Thread 2");
        t1.start();
        t2.start();
    }
}


/*
What Happens to the Resource a Thread Was Holding when the wait() method is called?
When a thread calls wait(), it releases the lock on the synchronized object it was holding.
Other threads can now acquire the lock and continue execution.
The waiting thread remains idle until another thread calls notify() or notifyAll().
 */

/*
Q. What Happens to the Idle Thread Once notify() or notifyAll() is Called?
When notify() or notifyAll() is called, the waiting thread does not immediately start running. Instead, it follows these steps:
When another thread calls notify(), one waiting thread is moved to the Blocked (or Runnable) State,
 but it does not start execution immediately.
The notified thread cannot resume execution until it successfully acquires the lock on the synchronized object.
If multiple threads are waiting, only one gets notified by notify(), while notifyAll() wakes up all waiting threads
(but they still compete for the lock).
Once the thread reacquires the lock, it continues execution from where it called wait().
 */

/*
Q. What If We Use notifyAll()?
If we replace notify(); with notifyAll();, all waiting threads will be notified, but only one will acquire the lock first as they will
compete for the lock, and execution depends on the thread scheduler.
 */