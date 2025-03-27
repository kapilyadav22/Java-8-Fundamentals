import java.util.*;

public class Sorting {
    //sort(List<T> list) - Sorts a list in natural order.
    //sort(List<T> list, Comparator<T> c) - Sorts a list using a custom comparator.

    //Collections.sort works on all list DS (ArrayList, LinkedList, Stack, Vector)
    //it doesn't work on  Non-List Data Structures
    //Convert Set, Queue, or Map to a List before sorting.

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        //list sort came in java 8, before java 8 Collections.sort was there.
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        list.sort(Collections.reverseOrder());
        System.out.println(list);


        Set<Integer> set = new HashSet<>(Arrays.asList(4, 1, 3, 5, 2));
        List<Integer> list2 = new ArrayList<>(set);
        Collections.sort(list2);
        System.out.println(list2);
    }
}
