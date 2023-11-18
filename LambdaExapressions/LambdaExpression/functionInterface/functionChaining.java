package functionInterface;

import java.util.function.Function;

//Function Chaining
	//andThen()
	//compose
public class functionChaining {

	public static void main(String[] args) {
		//<arguementtype,returntype>
		Function<Integer, Integer> f1 = n->n*2;
		Function<Integer, Integer> f2 = n->n*n;
		
		//using andThen, first f1 will execute and the result of f1 will pass to f2
		System.out.println(f1.andThen(f2).apply(10)); //400
		
		//using compose, first f2 will execute and then f1 will execute
		System.out.println(f2.andThen(f1).apply(10)); //200
	}

}
