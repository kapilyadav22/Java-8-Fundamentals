package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class MaptoLong {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1111111111111111111", "2", "3", "4", "5", "6", "7", "8", "9");
        LongStream LongStream = numbers.stream().mapToLong(Long::parseLong);

        long[] nums = LongStream.toArray();
        LongStream LongStream2 = Arrays.stream(nums);
        long[] filteredNums =  LongStream2.filter(x -> x % 2 != 0).toArray();
        System.out.println(Arrays.toString(filteredNums));
    }
}
