package IntermediateOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class limit {
    //Truncate the Stream
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Stream<Integer> stream = list.stream().limit(1);

         /*toList() came in Java 16+
        🔹 Immutable (Cannot be Modified)
        🔹 More Efficient
        🔹 Returns an Unmodifiable List
        */
        List<Integer> list2 = stream.toList();
        System.out.println(list2);

        //.collect(Collectors.toList()) came in java 8+
//        Returns a modifiable list (usually ArrayList).
//        Uses Collectors API, which allows more complex collection operations.
//        Safe for parallel streams.
        Stream<Integer> stream2 = list.stream().limit(2);
        List<Integer> list3 = stream2.collect(Collectors.toList());
        System.out.println(list3);
    }
}
