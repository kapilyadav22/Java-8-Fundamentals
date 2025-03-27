package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collect {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = list.stream().collect(Collectors.toList());
        System.out.println(list2);

        //using set
        Set<Integer> numbers = Stream.of(1, 2, 2, 3, 4, 4)
                .collect(Collectors.toSet());

        //using map
        Map<Integer, String> map = Stream.of("Alice", "Bob", "Charlie", "kapil")
                .collect(Collectors.toMap(
                        String::length,         // Key Mapper: String length as key
                        Function.identity(),    // Value Mapper: String itself as value
                        (s1, s2) -> s1  // Merge function: Keep the first occurrence if key conflict
                ));

        System.out.println(map); // Output: {3=Bob, 5=Alice, 7=Charlie}

        // Collecting with Joining (Concatenation)
        String result = Stream.of("Apple", "Banana", "Cherry")
                .collect(Collectors.joining(", "));
        System.out.println(result);

        // Collecting with Grouping
        List<String> words = List.of("apple", "banana", "kiwi", "mango", "pear");
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        //OUTPUT  : {4=[kiwi, pear], 5=[apple, mango], 6=[banana]}
        System.out.println(groupedByLength);

        //Using Custom Collector (Using Collector.of())

    }
}
