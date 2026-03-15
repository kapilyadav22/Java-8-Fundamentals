package ThreadsBasics;

import java.util.concurrent.*;

class MyCallable implements Callable<String>{

    private final String name;

    MyCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            result.append("Callable ").append(name)
                    .append(" is running: ").append(i).append("\n");
            Thread.sleep(500);
        }
        return result.toString();
    }
}

public class ThreadUsingCallableInterface {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<String> callable1 = new MyCallable("Task 1");
        Callable<String> callable2 = new MyCallable("Task 2");
        try {
            Future<String> future1 = executor.submit(callable1);
            Future<String> future2 = executor.submit(callable2);
            System.out.println("Result from first task:");
            System.out.println(future1.get()); // Blocks until the task completes

            System.out.println("Result from Second task:");
            System.out.println(future2.get()); // Blocks until the task completes

        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Task execution interrupted: " + e.getMessage());
        } finally {
            // Shutdown the executor
            executor.shutdown();
        }

    }
}


/*
Q. What is the Callable interface, and how does it differ from Runnable?
Answer: Callable is a functional interface introduced in Java 5 as part of the concurrency utilities.
The key differences from Runnable are:

Callable's call() method can return a result (it's a parameterized type), while Runnable's run() method returns void
Callable's call() method can throw checked exceptions, while Runnable's run() method cannot
Callable works with Future objects to handle the results asynchronously
*/