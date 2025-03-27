package Synchronized;

import java.util.*;

public class SynchronizedMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());
        map.put("A", 1);
        map.put("B", 2);

        synchronized (map) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
