package Synchronized;

import java.util.*;

public class SynchronizedList {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("A");
        list.add("B");

        // Synchronizing iteration manually
        synchronized (list) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
    //Why synchronize during iteration?
    //Even though add() and remove() are thread-safe, iteration is not inherently synchronized.

    /*
    Limitations of Collections.synchronizedXXX()
     1. Slower performance due to method-level synchronization.
     2. Not fully concurrent (blocking operations slow down execution).
     3. Iteration must be synchronized manually to avoid ConcurrentModificationException.

     Alternative: Concurrent Collections (Better for Multi-Threading)
        CopyOnWriteArrayList (Thread-safe alternative to ArrayList)
        ConcurrentHashMap (Thread-safe alternative to HashMap)
        ConcurrentLinkedQueue (Thread-safe alternative to Queue)
     */
}
