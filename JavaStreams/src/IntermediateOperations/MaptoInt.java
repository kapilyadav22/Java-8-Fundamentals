package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaptoInt {
    // mapToInt(ToIntFunction<T> mapper)
    //helps to work with primitive "int" data types
    public static void main(String[] args) {
    List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
    IntStream intStream = numbers.stream().mapToInt(Integer::parseInt);

    int[] nums = intStream.toArray();
    IntStream intStream2 = Arrays.stream(nums);
    int[] filteredNums =  intStream2.filter(x -> x % 2 == 0).toArray();
    System.out.println(Arrays.toString(filteredNums));
    }
}
