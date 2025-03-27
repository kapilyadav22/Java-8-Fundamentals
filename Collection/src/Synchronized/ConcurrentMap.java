package Synchronized;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {
    public static void main(String[] args) {
        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("A", 1);
        concurrentMap.put("B", 2);

        for (Map.Entry<String, Integer> entry : concurrentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
