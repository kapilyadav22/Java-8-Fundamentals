package IntermediateOperations.PrimaryStreams.LongStream;

import java.util.*;
import java.util.stream.*;

public class LongStreamDemo {
    public static void main(String[] args) {
        // From values
        LongStream lstream = LongStream.of(1L, 2L, 3L, 4L, 5L);
        long[] larr = lstream.toArray();
        System.out.println(Arrays.toString(larr));

        // From array
        long[] larr2 = {10L, 20L, 30L};
        LongStream lstream1 = Arrays.stream(larr2);
        lstream1.forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        // Using range
        LongStream lstream2 = LongStream.range(1, 5);       // 1,2,3,4 (exclusive upper bound)
        lstream2.forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        LongStream lstream3 = LongStream.rangeClosed(1, 5); // 1,2,3,4,5 (inclusive)
        lstream3.forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        // From Random
        LongStream lstream4 = new Random().longs(5, 1, 100); // 5 random longs between 1–99
        lstream4.forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        // Iterate
        LongStream lstream5 = LongStream.iterate(1, n -> n + 2).limit(5); // 1,3,5,7,9
        lstream5.forEach(n -> System.out.print(n + "\t"));
        System.out.println();
    }
}
