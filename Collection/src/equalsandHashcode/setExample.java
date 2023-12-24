package equalsandHashcode;

import java.util.HashSet;
import java.util.Set;

public class setExample {

	public static void main(String[] args) {
		Set<Student> studentSet = new HashSet<>();
		
		studentSet.add(new Student("Kapil", 26));
		studentSet.add(new Student("Rahul", 22));
		studentSet.add(new Student("Ajay", 25));
		studentSet.add(new Student("Yogesh", 21));
		studentSet.add(new Student("Vineet", 20));
		studentSet.add(new Student("Ajay", 26));
		
		System.out.println(studentSet);
	}
	
	
}
