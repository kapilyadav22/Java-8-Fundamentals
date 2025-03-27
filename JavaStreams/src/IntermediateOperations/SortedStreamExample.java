package IntermediateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Stream Methods

// sorted() anyMatch() allMatch() noneMatch()
//findAny() findFirst()

public class SortedStreamExample {
	//Sorts the elements
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(5,6,7,1,3,2,4,8,0,19);
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		//ReverseOrderSorting
		List<Integer> reverseSortedList = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSortedList);
	}

}
