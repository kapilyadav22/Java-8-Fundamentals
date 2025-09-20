package IntermediateOperations.PrimaryStreams.DoubleStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class DoubleStreamMethods {
    public static void main(String[] args) {

        DoubleStream stream = DoubleStream.of(5.0, 10.0, 15.0);

        // min, max, average return OptionalDouble
        double min = stream.min().getAsDouble();        // 5.0
        double max = DoubleStream.of(5.0, 10.0, 15.0).max().getAsDouble();  // 15.0
        double avg = DoubleStream.of(5.0, 10.0, 15.0).average().getAsDouble(); // 10.0

        System.out.println("Min " + min);
        System.out.println("Max " + max);
        System.out.println("Ave " + avg);

        // Converts primitive double to Double → Stream<Double>
        DoubleStream doubleStream = DoubleStream.of(5.0, 10.0, 15.0);
        Stream<Double> boxedStream = doubleStream.boxed();
        boxedStream.forEach(System.out::println);

        // reduce in DoubleStream returns double
        DoubleStream doubleStreams = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        double sum = doubleStreams.reduce(0.0, (a, b) -> a + b);
        System.out.println("Sum: " + sum); // 15.0

        // collect in DoubleStream (boxed first)
        DoubleStream doubleStream2 = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> list = doubleStream2.boxed()
                .collect(Collectors.toList());
        System.out.println(list); // [1.0, 2.0, 3.0, 4.0, 5.0]

        // toArray in DoubleStream returns double[]
        DoubleStream doubleStream3 = DoubleStream.of(10.0, 20.0, 30.0);
        double[] arr = doubleStream3.toArray();
        System.out.println(Arrays.toString(arr)); // [10.0, 20.0, 30.0]
    }
}


/*
 DoubleStream does not have range/rangeClosed. Use iterate() or map from IntStream.
 */