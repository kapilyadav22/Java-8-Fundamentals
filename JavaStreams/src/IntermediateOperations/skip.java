package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class skip {
    //Skips the first n elements of the stream.
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();
        List<Integer> list2 = stream.skip(1).collect(Collectors.toList());
        System.out.println(list2);
    }
}
