import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceAll {
    public static void main(String[] args) {
        //Collections.replaceAll(List<T> list, T oldValue, T newValue);
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 2));
        Collections.replaceAll(list, 2, 99);
        System.out.println(list);
    }
}

    /*
    Replaces all occurrences of a value in a list.
    Works with mutable lists (not Arrays.asList() directly).
    O(n) time complexity, efficient for large lists.
    */
