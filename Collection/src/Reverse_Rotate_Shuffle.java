import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_Rotate_Shuffle {
    public static void main(String[] args) {
        //reverse(List<T> list) - Reverses the order of elements.
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        //shuffle
        Collections.shuffle(numbers);
        System.out.println(numbers);

        //Rotate - rotate(List<T> list, int distance)
        /*distance → Number of positions to rotate
                Positive value (+n) → Shifts elements to the right.
                Negative value (-n) → Shifts elements to the left.
         */
        Collections.rotate(numbers, 2);
        System.out.println("Numbers list after Rotating for 2 times " + numbers);

        //when distance > list size,it will do -> distance % k
        //Java retains the sign of the dividend (a % b keeps a's sign).
        Collections.rotate(numbers, 7);

    }
}
