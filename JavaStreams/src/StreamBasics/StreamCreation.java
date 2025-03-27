package StreamBasics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;


// cmd + option + L => code format
public class StreamCreation {

    public static void main(String[] args) {
        //1. Using Stream.of()
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);

        //2. Using Arrays.stream()
        int[] arr = {1, 2, 3, 4, 5};
        IntStream stream2 = Arrays.stream(arr);

        //3. Using List.stream()
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5); //fixed Size List
        List<Integer> list2 = List.of(5, 6, 7, 8, 9);
        Stream<Integer> stream3 = list1.stream();
        Stream<Integer> stream4 = list2.stream();

        //4.  Using Set.stream()
        Set<Integer> set = Set.of(1, 2, 3, 4, 5);
        Stream<Integer> stream5 = set.stream();

        //5. Using Map.entrySet().stream()
        Map<Integer, String> map = Map.ofEntries(Map.entry(1, "K"), Map.entry(3, "A"), Map.entry(5, "P"));
        Stream<Map.Entry<Integer, String>> stream6 = map.entrySet().stream();

        //6. Using Stream Builder
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(1).add(2).add(3);

        Stream<Integer> stream7 = streamBuilder.build();
        stream7.forEach(System.out::println);

        Stream<Integer> stream8 = Stream.<Integer>builder().add(1).add(2).add(3).build();

        //7. Using Stream.iterate()
        //1 is start point
        //n+1 is increament value
        //limit is the number of elements
        Stream<Integer> stream9 = Stream.iterate(1, n -> n + 1).limit(5);

//        System.out.println(stream);
//        System.out.println(stream2);
//        System.out.println(stream3);
//        System.out.println(stream4);
//        System.out.println(stream5);
//        System.out.println(stream6);
//        System.out.println(stream7);
//        System.out.println(stream8);
//        System.out.println(stream9);
    }
}

