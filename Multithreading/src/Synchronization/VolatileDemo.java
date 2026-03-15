package Synchronization;


public class VolatileDemo {
    // Declaring the flag as volatile ensures that changes to 'running'
    // in one thread are immediately visible to other threads.
    private volatile boolean running = true;
    // Method executed by the worker thread.
    public void runTask() {
        System.out.println("WorkerThread: Starting execution...");
        int counter = 0;
        // Continuously increment counter until 'running' becomes false.
        while (running) {
            counter++;
        }
        System.out.println("WorkerThread: Detected stop signal. Final counter value: " + counter);
    }
    // Called by the main thread to stop the worker thread.
    public void stopTask() {
        running = false;
    }
    // Main method to run the example.
    public static void main(String[] args) {
        VolatileDemo example = new VolatileDemo();
        // Create and start the worker thread.
        Thread workerThread = new Thread(new Runnable() {
            public void run() {
                example.runTask();
            }
        }, "WorkerThread");
        workerThread.start();
        // Let the worker thread run for a while.
        try {
            Thread.sleep(2000);  // Main thread sleeps for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MainThread: Stopping the worker thread.");
        example.stopTask(); // Signal the worker thread to stop
        // Wait for the worker thread to finish execution.
        try {
            workerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MainThread: Execution finished.");
    }
}

/*
🔁 Volatile Keyword in Java
The volatile keyword in Java is used to indicate that a variable’s value will be modified by multiple threads .
Declaring a variable as volatile ensures two key things:

1️⃣ Visibility :
When a variable is declared volatile, its value is always read from and written to the main memory 🧠 instead of a thread’s local cache.

 ✅ This means changes made by one thread are immediately visible to others.
 ❌ Without volatile, updates in one thread might not be seen (or might be delayed) by others due to caching .

2️⃣ Ordering
volatile establishes a happens-before relationship.

 🔐 Operations on a volatile variable cannot be re-ordered relative to each other.
 📍This is especially helpful when using flags or controlling execution flow to ensure instructions are executed in the intended order.

🕹️ When to Use volatile
• Flags and Status Variables
 Used to signal threads (e.g., a shutdown flag or status switch).

• Singleton Patterns (with double-checked locking)
 In lazy initialization patterns, volatile ensures that the constructed instance is visible to all threads correctly.

• Lightweight Synchronization
 If you only need visibility guarantees (not atomicity for compound actions like x++), volatile is lighter and faster than using synchronized.

 volatile is not thread safe
 */