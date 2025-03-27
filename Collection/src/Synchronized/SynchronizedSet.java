package Synchronized;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedSet {
    public static void main(String[] args) {
        Set<Integer> set = Collections.synchronizedSet(new HashSet<>());
        set.add(1);
        set.add(2);

        synchronized (set) {
            for (int num : set) {
                System.out.println(num);
            }
        }

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        Set<Integer> integerSet = Collections.synchronizedSet(set2);
        System.out.println(integerSet);
    }
}
