import java.util.*;

public class Min_Max_Custom_Objects {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Kapl", 85),
                new Student("Rahul", 78),
                new Student("Ravi", 92)
        );

        Comparator<Student> marksComparator = Comparator.comparingInt(s -> s.marks);

        Student minStudent = Collections.min(students, marksComparator);
        Student maxStudent = Collections.max(students, marksComparator);

        System.out.println("Student with min marks: " + minStudent);
        System.out.println("Student with max marks: " + maxStudent);

    }
}

