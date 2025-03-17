package filterInStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample3 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Kapil", null, "Rahul", null,"Vineet", null, "Aditya", "javved");

		List<String> nonNullWords = new ArrayList<>();

		nonNullWords = words.stream().filter(str->str!=null).collect(Collectors.toList());
		System.out.println(nonNullWords);

	}

}
