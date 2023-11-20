package flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String name;
	int sid;
	char grade;

	Student(String name, int sid, char grade) {
		super();
		this.name = name;
		this.sid = sid;
		this.grade = grade;
	}
}

public class FlatMatExample3 {

	public static void main(String[] args) {

		List<Student> studentList1 = new ArrayList<Student>();
		studentList1.add(new Student("Kapil", 1, 'A'));
		studentList1.add(new Student("Rahul", 2, 'B'));
		studentList1.add(new Student("Kapil", 3, 'C'));

		List<Student> studentList2 = new ArrayList<Student>();
		studentList2.add(new Student("Ajay", 4, 'A'));
		studentList2.add(new Student("Vineet", 5, 'B'));
		studentList2.add(new Student("Alok", 6, 'C'));

		// Add both collection in one single collection
		List<List<Student>> combinedList = Arrays.asList(studentList1, studentList2);
		List<String> studentList = combinedList.stream().flatMap(stulist -> stulist.stream()).map(s -> s.name)
				.collect(Collectors.toList());
		System.out.println(studentList);
	}

}
