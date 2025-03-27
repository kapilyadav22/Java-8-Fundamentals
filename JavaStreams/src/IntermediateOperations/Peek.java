package IntermediateOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peek {
    //Can be use for debugging and logging
    //
    public static void main(String[] args) {
        List<String> names = List.of("Kapil","Rahul","Mohit","Virat");
        Stream<String> stream = names.stream().peek(value -> System.out.println(value));
        Stream<String> stream2 = names.stream().peek(System.out::println);

        //intermediate operations are lazy, they will not work until we use terminal operations,
        List<String> updatedNames = names.stream().map(String::toUpperCase).peek(System.out::println).toList();

        System.out.println(updatedNames);
    }
}
