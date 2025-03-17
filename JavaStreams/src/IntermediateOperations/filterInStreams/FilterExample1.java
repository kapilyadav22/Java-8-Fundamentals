package filterInStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample1 {

	public static void main(String[] args) {
//		ArrayList<Integer> numbersList = new ArrayList<>();
//		numbersList.add(10);
//		numbersList.add(20);
//		numbersList.add(30);
//		numbersList.add(40);
//		numbersList.add(50);

		List<Integer> numbersList = Arrays.asList(10,20,30,40,50);
		List<Integer> evenNumbersList = new ArrayList<>();

		//without using stream
		for(int number : numbersList) {
			if(number%2==0) {
				evenNumbersList.add(number);
			}
		}

		System.out.println(evenNumbersList);

		//with streams
		//filter method always takes a boolean expression as a parameter
		//predicate Functional Interface
		evenNumbersList = numbersList.stream().filter(n-> n%2==0).collect(Collectors.toList());

		System.out.println(evenNumbersList);

		//if i dont want to store it in variable
		//consumer Functional Interface
		numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		//System.out is a static variable, so we can directly access println from it
		numbersList.stream().filter(n->n%2==0).forEach(System.out::println);

	}

}
