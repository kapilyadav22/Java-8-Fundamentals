import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Empty {
    public static void main(String[] args) {
        //Collections.emptyList() → List<T>
        List<String> emptyList = Collections.emptyList();
        System.out.println(emptyList); // Output: []

        //Collections.emptySet() → Set<T>
        Set<Integer> emptySet = Collections.emptySet();
        System.out.println(emptySet); // Output: []
        // emptySet.add(10); // Throws UnsupportedOperationException


        //Collections.emptyMap() → Map<K, V>
        Map<String, String> emptyMap = Collections.emptyMap();
        System.out.println(emptyMap); // Output: {}

        // emptyMap.put("Key", "Value"); // Throws UnsupportedOperationException


    }
}
