package predicate;

import java.util.function.Predicate;

//Predicate Interface can be use when we have some conditional statements
public class PredicateExample {
	
	public static void main(String[] args) {
	
		Predicate<Integer> p = i->(i>20);
		System.out.println(p.test(30)); //true
		System.out.println(p.test(20)); //false
		
	}
}
