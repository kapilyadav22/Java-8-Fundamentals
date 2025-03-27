package IntermediateOperations;

import java.time.LocalDateTime;
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
		long currentSequentialTime = System.currentTimeMillis();
		studentList.stream().filter(x -> x.getScore() >= 80).limit(10)
				.forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));
		System.out.println("Sequential Stream time: " + (System.currentTimeMillis() - currentSequentialTime) + " milliseconds");

		//parallel stream
		long currentTime = System.currentTimeMillis();
		studentList.parallelStream().filter(x -> x.getScore() >= 80).limit(10)
		.forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));
		System.out.println("Parallel Stream time: " + (System.currentTimeMillis() - currentTime) + " milliseconds");

		//convert stream() -> parallelStream
		studentList.stream().parallel().filter(x -> x.getScore() >= 80).limit(3)
		.forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));
		System.out.println("Converting existing stream to parallel stream");

	}


}

/*
1. Serial Stream (Sequential Stream)
	Processes elements one at a time in a single thread.
	Uses a single CPU core.
	Preserves the order of elements.
	Slower for large data sets due to sequential execution.
	Default stream behavior.

2. Parallel Stream
	Processes elements concurrently using multiple threads.
	Uses multiple CPU cores, improving performance on large data sets.
	May not preserve order.
	Uses the Fork/Join framework internally.
	Best suited for computationally expensive operations.
*/


/*
Parallel Stream:
	Internally, It does:
	task splitting : It uses spliterator function to split the data into multiple chunks.
	Inside spliterator, there is trySplit() method, which split it (into smaller data (mostly by half-half)).
	task submission and parallel processing : Uses Fork-join pool technique.
 */