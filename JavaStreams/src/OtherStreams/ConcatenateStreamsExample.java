package OtherStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateStreamsExample {

	public static void main(String[] args) {
		List<String> animalsList = Arrays.asList("Lion", "Tiger", "Giraffe");
		List<String> birdsList = Arrays.asList("parrot", "peacock", "pigeon");

		Stream<String> stream1 = animalsList.stream();
		Stream<String> stream2 = birdsList.stream();

		//concat streams
		List<String> finalliList=Stream.concat(stream1,stream2).collect(Collectors.toList());
		System.out.println(finalliList);
	}
}
