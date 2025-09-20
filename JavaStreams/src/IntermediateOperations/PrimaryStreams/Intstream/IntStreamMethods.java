package IntermediateOperations.PrimaryStreams.Intstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamMethods {
    public static void main(String[] args) {

        IntStream stream = IntStream.of(5, 10, 15); //internally uses Arrays.stream(arr);

        //min,max return OptionalInt and average returns OptionalDouble so handle them we use getAsInt(),getAsDouble()
        // sum and count returns direct values
        //getAsLong() does not exist for IntStream itself.

        int min = stream.min().getAsInt();        // 5
        int max = IntStream.of(5,10,15).max().getAsInt();  // 15
        double avg = IntStream.of(5,10,15).average().getAsDouble(); // 10.0

        System.out.println("Min " + min);
        System.out.println("Max " + max);
        System.out.println("Ave " + avg);


        //Converts primitive int to Integer → Stream<Integer>.
        IntStream intStream = IntStream.of(5, 10, 15);
        Stream<Integer> boxedStream = intStream.boxed();
        boxedStream.forEach(System.out::println);

        //reduce in intstream returns int
        IntStream intStreams = IntStream.of(1, 2, 3, 4, 5);
        int sum = intStreams.reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum); // 15


        //collect in intstream Uses ObjIntConsumer instead of BiConsumer → primitive specialization
        IntStream intStream2 = IntStream.of(1, 2, 3, 4, 5);
        List<Integer> list = intStream2.boxed()
                .collect(Collectors.toList());
        System.out.println(list); // [1, 2, 3, 4, 5]


        //toArray in intstream returns int[]
        IntStream intStream3 = IntStream.of(10, 20, 30);
        int[] arr = intStream3.toArray();
        System.out.println(Arrays.toString(arr)); // [10, 20, 30]

    }
}


/*
Terminal: sum(), average(), min(), max(), reduce(), collect(), toArray(), etc.
 */