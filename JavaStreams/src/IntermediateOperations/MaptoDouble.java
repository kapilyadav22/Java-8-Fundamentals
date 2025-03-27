package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class MaptoDouble {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1.11111", "2.222222", "3", "4", "5", "6", "7", "8", "9");
        DoubleStream doubleStream = numbers.stream().mapToDouble(Double::parseDouble);

        double[] nums = doubleStream.toArray();
        DoubleStream doubleStream2 = Arrays.stream(nums);
        double[] filteredNums =  doubleStream2.filter(x -> x % 2 != 0).toArray();
        System.out.println(Arrays.toString(filteredNums));
    }
}
