package flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample1 {

	public static void main(String[] args) {
		List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> finallists = new ArrayList<>();

		// map
		finallists = lists.stream().map(x -> x + 10).collect(Collectors.toList());
		System.out.println(finallists);

		// flatMap
		List<Integer> lists1 = Arrays.asList(1, 2);
		List<Integer> lists2 = Arrays.asList(3, 4);
		List<Integer> lists3 = Arrays.asList(5, 6);
		List<Integer> lists4 = Arrays.asList(7, 8);

		List<List<Integer>> combinedLists = Arrays.asList(lists1, lists2, lists3, lists4);
		List<Integer> updatedCombinedLists = new ArrayList<>();

		updatedCombinedLists = combinedLists.stream().flatMap(x -> x.stream().map(n -> n + 10))
				.collect(Collectors.toList());
		System.out.println(updatedCombinedLists);
	}

}
