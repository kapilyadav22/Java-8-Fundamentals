package IntermediateOperations.PrimaryStreams.Intstream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamDemo {

    public static void main(String[] args) {

        //Create IntStream
        // From values
        IntStream stream= IntStream.of(1, 2, 3, 4, 5);
        int[] arr = stream.toArray();
        System.out.print(Arrays.toString(arr));

        // From arrays
        int[] arr2 = {10, 20, 30};
        IntStream stream1 = Arrays.stream(arr2);
        stream1.forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        // Using range
        IntStream stream2 =  IntStream.range(1, 5);       // 1,2,3,4  (exclusive upper bound)
        stream2.forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        IntStream stream3 = IntStream.rangeClosed(1, 5); // 1,2,3,4,5  (inclusive upper bound)
        stream3.forEach(n -> System.out.print(n + "\t"));

       // From Random
        IntStream stream4 = new Random().ints(5, 1, 100); // 5 random ints between 1–99
        stream4.forEach(n -> System.out.print(n + "\t"));
        System.out.println();
        //Iterate
        IntStream stream5 = IntStream.iterate(1, n -> n + 2).limit(5); // 1,3,5,7,9
        stream5.forEach(n -> System.out.print(n + "\t"));
        System.out.println();

    }
}


/*
In Java, the Stream<T> API is generic, but primitives (int, long, double) would require boxing/unboxing if we only used Stream<Integer>, Stream<Long>, etc.
To avoid performance penalties, Java provides specialized primitive streams:
        IntStream → for int
	    LongStream → for long
        DoubleStream → for double
 */