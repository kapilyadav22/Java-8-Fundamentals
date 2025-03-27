import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Singleton {
    public static void main(String[] args) {
        //Singleton Set : Collections.singleton(T obj) → Set<T>

        Set<String> singletonSet = Collections.singleton("Hello");
        System.out.println(singletonSet); // Output: [Hello]

        // Trying to modify it will throw an UnsupportedOperationException
        //singletonSet.add("World");

        //SingletonMap : Collections.singletonMap(K key, V value) → Map<K, V>
        Map<String, Integer> singletonMap = Collections.singletonMap("Age", 25);
        System.out.println(singletonMap);

        //SingletonList : Collections.singletonList(T obj) → List<T>
        List<Integer> singletonList = Collections.singletonList(30);
        System.out.println(singletonList); // Output: [30]

    }
}

/*
A singleton collection is immutable, meaning it cannot be modified after creation.
Singleton collections are thread-safe since they are immutable.
 */
