package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//findAny //findFirst
public class FindAnyFindFirst {

	public static void main(String[] args) {

		List<String> list  = Arrays.asList("one","two", "one", "three");

		//findAny store any element, if collection is not empty
		Optional<String> ele =list.stream().findAny();

		System.out.println(ele.get()); //one or NoSuchElementException

		//findFirst will find the first element from the stream
		Optional<String> ele2 = list.stream().findFirst();
		System.out.println(ele2.get()); //one or NoSuchElementException
	}

}
