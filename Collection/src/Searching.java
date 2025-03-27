import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Searching {
//    binarySearch(List<T> list, T key) - Searches a sorted list.
    /*
    Returns:
    Index (≥ 0) if the element is found.
    Negative value (-insertionPoint - 1) if not found
   (where insertionPoint is the index where it should be inserted to maintain order).
    */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //if element exist
        int index = Collections.binarySearch(list, 5);
        System.out.println(index);

        //if element doesn't exist
        index = Collections.binarySearch(list, 6); //insertion point is 5, so -5-1 = -6
        System.out.println(index);

        List<String> words = Arrays.asList("apple", "banana", "cherry", "mango");
        int wordIndex = Collections.binarySearch(words, "cherry");
        System.out.println(wordIndex);


        //  binarySearch(List<T> list, T key, Comparator<? super T> c)
        /*
        By default, binarySearch() assumes that the list is sorted in natural order.
        When Elements are sorted in custom order, we need to give comparator to binarySearch, same as sorting order,
         */

        Comparator<Integer> descComparator = Comparator.reverseOrder();
        Collections.sort(list, descComparator);

        int eleIndex = Collections.binarySearch(list, 5, descComparator);
        System.out.println("Index of 30: " + eleIndex);

    }
}
