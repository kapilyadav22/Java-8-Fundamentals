package predicate;

import java.util.function.Predicate;

//Joining Predicates - and, or, negate
	//p1 && p2
	// p1 || p2
	//p1.negate().test()


//p1 -> check, if number is evem
//p2 -> checks, number>50

public class PredicateExample5 {

	public static void main(String[] args) 		{
		int arr[] = {10,20,33,24,23,5,3,53,35,85,54,60,70,78};

		Predicate<Integer> p1 = n->n%2==0;
		Predicate<Integer> p2 = n->n>50;

		//and predicates
		for(int num : arr) {
			//if(p1.test(num) && p2.test(num)) {
			if(p1.and(p2).test(num)) {
				System.out.println(num);
			}
		}
		System.out.println("\n Or Predicate");

		//or Predicates
		for(int num : arr) {
			//if(p1.test(num) || p2.test(num)) {
			if(p1.or(p2).test(num)) {
				System.out.println(num);
			}

		}

		System.out.println("\n negate Predicate");
		for(int num : arr) {
			if(p1.negate().test(num)) {
				System.out.println(num);
			}

		}


	}
}
