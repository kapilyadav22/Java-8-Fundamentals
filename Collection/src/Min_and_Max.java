import java.util.*;

public class Min_and_Max {
   //    min(Collection<T> coll) - Returns the minimum element.
   //    max(Collection<T> coll) - Returns the maximum element

    /*
    Conditions:
        The collection must not be empty, otherwise NoSuchElementException is thrown.
        If the collection contains null, a NullPointerException will be thrown.
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int maxEle = Collections.max(list);
        int minEle = Collections.min(list);

        //Collections.min(Collection<T> coll, Comparator<? super T> comp)
        //Collections.max(Collection<T> coll, Comparator<? super T> comp)
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "strawberry");
        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);

        String shortestWord = Collections.min(words, lengthComparator);
        String longestWord = Collections.max(words, lengthComparator);

        System.out.println("Shortest word: " + shortestWord);
        System.out.println("Longest word: " + longestWord);

        //Handling null values using comparator
        List<Integer> numbers = Arrays.asList(10, 5, null, 20, 15);

//        Comparator.nullsLast() ensures that null values are placed after non-null values.
        Comparator<Integer> nullSafeComparator = Comparator.nullsLast(Comparator.naturalOrder());
        Integer minVal = Collections.min(numbers, nullSafeComparator);
        Integer maxVal = Collections.max(numbers, nullSafeComparator);

        System.out.println("Min: " + minVal); // Output: Min: 5
        System.out.println("Max: " + maxVal); //Output : Max : null

        // Safe min/max calculations by ignoring null values
        Integer minVal1 = numbers.stream().filter(Objects::nonNull).min(Comparator.naturalOrder()).orElse(null);
        Integer maxVal1 = numbers.stream().filter(Objects::nonNull).max(Comparator.naturalOrder()).orElse(null);

        System.out.println("Min: " + minVal1); // Output: Min: 5
        System.out.println("Max: " + maxVal1); // Output: Max: 20



    }
}
