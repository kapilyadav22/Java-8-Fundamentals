package predicate;

import java.util.function.Predicate;

//Predicate Interface can be use when we have some conditional statements
public class PredicateExample2 {
	
	public static void main(String[] args) {
		
		//check the length of string, whether is greater than 4 or not
		Predicate<String> p = s->(s.length()>4);
		System.out.println(p.test("kapil")); //true
		System.out.println(p.test("Raj")); //false
		
	}
}
