package functionInterface;

import java.util.function.Function;

public class functionExample1 {

	public static void main(String[] args) {

		Function<Integer, Integer> f = n->n*n;

		System.out.println(f.apply(10));
		System.out.println(f.apply(20));
		System.out.println(f.apply(30));
		System.out.println(f.apply(40));
		System.out.println(f.apply(50));
		System.out.println(f.apply(60));
	}

}

