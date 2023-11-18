package filterInStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterExample2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Kapil", "Rahul", "Vineet", "Aditya", "javved");
		List<String> longNames = new ArrayList<String>();

//		longNames = names.stream().filter(str -> str.length() > 5 && str.length() < 10).collect(Collectors.toList());
//		System.out.println(longNames);

		names.stream().filter(str -> str.length() > 5 && str.length() < 10).forEach(str -> System.out.println(str));

	}

}
