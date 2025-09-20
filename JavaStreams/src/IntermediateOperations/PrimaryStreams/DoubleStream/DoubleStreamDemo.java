package IntermediateOperations.PrimaryStreams.DoubleStream;

import java.util.*;
import java.util.stream.*;

public class DoubleStreamDemo {
    public static void main(String[] args) {
        // From values
        DoubleStream dstream = DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5);
        double[] darr = dstream.toArray();
        System.out.println(Arrays.toString(darr));

        // From array
        double[] darr2 = {10.5, 20.5, 30.5};
        DoubleStream dstream1 = Arrays.stream(darr2);
        dstream1.forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        // Using range (no direct DoubleStream.range, use iterate)
        DoubleStream dstream2 = DoubleStream.iterate(1.0, n -> n + 1.0).limit(4); // 1.0,2.0,3.0,4.0
        dstream2.forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        DoubleStream dstream3 = DoubleStream.iterate(1.0, n -> n + 1.0).limit(5); // 1.0–5.0
        dstream3.forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        // From Random
        DoubleStream dstream4 = new Random().doubles(5, 1.0, 100.0); // 5 random doubles between 1–100
        dstream4.forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        // Iterate
        DoubleStream dstream5 = DoubleStream.iterate(1.0, n -> n + 2.0).limit(5); // 1.0,3.0,5.0,7.0,9.0
        dstream5.forEach(n -> System.out.print(n + "\t"));
        System.out.println();
    }
}
