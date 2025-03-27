package IntermediateOperations.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample2 {

	public static void main(String[] args) {
		List<String> teamA = Arrays.asList("Virat", "Rohit", "Jaddu");
		List<String> teamB = Arrays.asList("David Warner", "Maxwell", "Cummins");
		List<String> teamC = Arrays.asList("Kane", "Mitchell", "Anderson");

		List<List<String>> playersInWC2023 = Arrays.asList(teamA, teamB, teamC);

		// before Java8
		for (List<String> team : playersInWC2023) {
			for (String player : team) {
				System.out.println(player);
			}
		}
		// in Java 8, using flatMap
		List<String> combinedPlayerList = playersInWC2023.stream().flatMap(t -> t.stream())
				.collect(Collectors.toList());
		System.out.println(combinedPlayerList);
	}

}
