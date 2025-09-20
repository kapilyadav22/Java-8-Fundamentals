package TerminalOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Count_Min_Max_Reduce {

	public static void main(String[] args) {

		List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		//count()
		long numberOfEvenNumbers = numbersList.stream().filter(num->num%2==0).count();
		System.out.println(numberOfEvenNumbers);

		//min
		Optional<Integer> min= numbersList.stream().min(Comparator.naturalOrder());
		System.out.println(min.get());

		//max
		Optional<Integer> max= numbersList.stream().max(Integer::compareTo);
		System.out.println(max.get());


		//reduce
		//does reduction on the stream.Perform associative aggregation function
		List<String> stringlList = Arrays.asList("A", "B", "C", "1", "2","3","4");

		Optional<String> reduced = stringlList.stream().reduce((value, combinedValue)-> {
			return combinedValue+value;}
		);

		List<Integer> list = Arrays.asList(1, 2,3,4);

		Optional<Integer> reducedList = list.stream().reduce(Integer::sum);
		System.out.println("Reduced List is " + reducedList.get());
	}

}
