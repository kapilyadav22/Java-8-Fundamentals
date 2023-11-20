package OtherStreams;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.management.ValueExp;

//anyMatch
//allMatch
//noneMatch
public class AnyMatchAllMatchNoneMatch {

	public static void main(String[] args) {

		Set<String> fruitSet = new HashSet<String>();
		fruitSet.add("One Mango");
		fruitSet.add("Two Pineapples");
		fruitSet.add("One Papaya");
		fruitSet.add("Three Oranges");
		fruitSet.add("Two bananas");

		// will take predicate as parameter
		// anymatch will return true, if any entry starts with One
		boolean result = fruitSet.stream().anyMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result); // true

		// allMatch will return true, if all entries start with One
		boolean result2 = fruitSet.stream().allMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result2); // false

		// noneMatch will return true, if none of the entries start with One
		boolean result3 = fruitSet.stream().noneMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result3); // false

	}

}
