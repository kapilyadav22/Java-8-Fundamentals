import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAndShuffle {
    public static void main(String[] args) {
        //reverse(List<T> list) - Reverses the order of elements.
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        //shuffle
        Collections.shuffle(numbers);
        System.out.println(numbers);

    }
}
