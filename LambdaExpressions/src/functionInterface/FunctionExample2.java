package functionInterface;

import java.util.function.Function;

public class FunctionExample2 {

	public static void main(String[] args) {
		Function<String, Integer> f = s->s.length();

		System.out.println(f.apply("Kapil"));
		System.out.println(f.apply("Rahul"));
		System.out.println(f.apply("Vineet"));
		System.out.println(f.apply("Abhishek"));
		System.out.println(f.apply("aditya"));
		System.out.println(f.apply("Alok"));

	}

}
