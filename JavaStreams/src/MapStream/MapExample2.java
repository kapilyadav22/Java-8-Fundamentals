package mapStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample2 {

	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("car", "bus", "truck", "flight", "auto");
		//find the length of every word and put it in another collection

		List<Integer> wordLengthsIntegers = new ArrayList<>();
		wordLengthsIntegers = vehicles.stream().map(word-> word.length()).collect(Collectors.toList());
		System.out.println(wordLengthsIntegers);

		//for printing without storing
		vehicles.stream().map(word-> word.length()).forEach(wordlen->System.out.println(wordlen));

		//without wordlen
		vehicles.stream().map(word-> word.length()).forEach(System.out::println);

	}

}
