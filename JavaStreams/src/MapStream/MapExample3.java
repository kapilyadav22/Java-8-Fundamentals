package mapStream;

import java.util.Arrays;
import java.util.List;

public class MapExample3 {

	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(10,20,30,40,50);

		//multiply everynumber by 3

		numbersList.stream().map(n->n*3).forEach(num->System.out.println(num));

		//:: represents we println holds a parameter, so no need to specify it
		numbersList.stream().map(n->n*3).forEach(System.out::println);
	}

}
