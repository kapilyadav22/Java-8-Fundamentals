package predicate;

import java.util.function.Predicate;

//Predicate Interface can be use when we have some conditional statements
public class PredicateExample3 {
	
	public static void main(String[] args) {
		
		//print array elements whose size is greater than 4
		
		String names[] = {"Kapil", "Rahul", "Vineet", "Ravi", "Rohit"};
		
		Predicate<String> p = s->(s.length()>4);
		for(String name: names) {
				if(p.test(name)) {
					System.out.println(name);
				}
		}
	}
}
