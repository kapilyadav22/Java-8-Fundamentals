package IntermediateOperations.PrimaryStreams.LongStream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class LongStreamMethods {
    public static void main(String[] args) {

        LongStream stream = LongStream.of(5L, 10L, 15L);

        // min, max return OptionalLong, average returns OptionalDouble
        long min = stream.min().getAsLong();        // 5
        long max = LongStream.of(5L, 10L, 15L).max().getAsLong();  // 15
        double avg = LongStream.of(5L, 10L, 15L).average().getAsDouble(); // 10.0

        System.out.println("Min " + min);
        System.out.println("Max " + max);
        System.out.println("Ave " + avg);

        // Converts primitive long to Long → Stream<Long>
        LongStream longStream = LongStream.of(5L, 10L, 15L);
        Stream<Long> boxedStream = longStream.boxed();
        boxedStream.forEach(System.out::println);

        // reduce in LongStream returns long
        LongStream longStreams = LongStream.of(1L, 2L, 3L, 4L, 5L);
        long sum = longStreams.reduce(0L, (a, b) -> a + b);
        System.out.println("Sum: " + sum); // 15

        // collect in LongStream (boxed first)
        LongStream longStream2 = LongStream.of(1L, 2L, 3L, 4L, 5L);
        List<Long> list = longStream2.boxed()
                .collect(Collectors.toList());
        System.out.println(list); // [1, 2, 3, 4, 5]

        // toArray in LongStream returns long[]
        LongStream longStream3 = LongStream.of(10L, 20L, 30L);
        long[] arr = longStream3.toArray();
        System.out.println(Arrays.toString(arr)); // [10, 20, 30]
    }
}



/*

Primitive streams (IntStream, LongStream, DoubleStream) all support the same terminal operations: sum(), average(), min(), max(), reduce(), collect(), toArray().

Optional handling:
IntStream.min()/max() → OptionalInt → .getAsInt()
LongStream.min()/max() → OptionalLong → .getAsLong()
DoubleStream.min()/max()/average() → OptionalDouble → .getAsDouble()


boxed() is needed to convert primitives to their wrapper object streams for collect() to List.
collect() → works, but primitive streams use ObjIntConsumer / ObjLongConsumer / ObjDoubleConsumer internally
toArray() → returns primitive array (int[], long[], double[])

Always handle Optional carefully with .isPresent() or getAsInt()/getAsLong()/getAsDouble()


Boxing / unboxing
-> Primitive streams avoid boxing overhead → more efficient than Stream<Integer> for numeric operations.
-> Use .boxed() only when you need objects, e.g., for collect(Collectors.toList()).
 */