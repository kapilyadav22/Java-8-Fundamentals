package OtherStreams;

import java.util.Arrays;
import java.util.List;

class Student {

	String name;
	int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}

public class ParallelStream {

	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList(new Student("Kapil", 90), new Student("Rahul", 80),
				new Student("Vineet", 70), new Student("Aditya", 80));

		//sequential stream
		studentList.stream().filter(x -> x.getScore() >= 80).limit(3)
				.forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));
		
		
		//parallel stream
		studentList.parallelStream().filter(x -> x.getScore() >= 80).limit(3)
		.forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));
		
		//convert stream() -> parallelStream
		studentList.stream().parallel().filter(x -> x.getScore() >= 80).limit(3)
		.forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));

	}
	

}
