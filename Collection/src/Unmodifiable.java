import java.util.*;

public class Unmodifiable {
//    unmodifiableList(List<T> list), unmodifiableSet(Set<T> set), unmodifiableMap(Map<K,V> map)
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> unmodifiableList = Collections.unmodifiableList(list);

        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> unmodifiableSet = Collections.unmodifiableSet(set);

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);

        System.out.println("Unmodifiable List: " + unmodifiableList);
        System.out.println("Unmodifiable Set: " + unmodifiableSet);
        System.out.println("Unmodifiable Map: " + unmodifiableMap);

        list.add("D");
        //NOTE : Changes in Original list will affect the unmodifiableList!
        System.out.println(unmodifiableList);

        // Uncommenting below lines will throw UnsupportedOperationException
        // unmodifiableList.add("D");
        // unmodifiableSet.add(4);
        // unmodifiableMap.put("Three", 3);
    }
}

/*
Truly Immutable Collections (List.of(), Set.of(), Map.of()):
Java 9 introduced factory methods (List.of(), Set.of(), Map.of()) to create truly immutable collections.
 */
