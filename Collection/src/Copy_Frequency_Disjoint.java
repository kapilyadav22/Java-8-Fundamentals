import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Copy_Frequency_Disjoint {
    public static void main(String[] args){
        //copy(List<T> dest, List<T> src) - Copies one list into another.
        List<String> source = Arrays.asList("A", "B", "C");
        List<String> destination = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
        Collections.copy(destination, source);
        System.out.println("Destination List after copy: " + destination);

        //frequency(Collection<T> coll, T obj) - Counts occurrences.
        int freq = Collections.frequency(source, "A");
        System.out.println("Frequency of A: " + freq);

        //disjoint(Collection<?> c1, Collection<?> c2) - Checks if two collections have no elements in common.
        //If they do not share any element, it returns true.
        //If they share at least one element, it returns false.
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9);
        List<Integer> list3 = Arrays.asList(3, 7, 8);

        System.out.println("List1 and List2 are disjoint: " + Collections.disjoint(list1, list2));
        System.out.println("List1 and List3 are disjoint: " + Collections.disjoint(list1, list3));
    }
}
