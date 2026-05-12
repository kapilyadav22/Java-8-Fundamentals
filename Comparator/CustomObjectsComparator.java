import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int marks;
    private int age;

    public Student(String name, int marks, int age) {
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " -> Marks: " + marks + ", Age: " + age;
    }
}

public class CustomObjectsComparator {

    public static void main(String[] args){

        List<Student> students = Arrays.asList(
                new Student("Kapil", 85, 24),
                new Student("Rahul", 78, 22),
                new Student("Ravi", 92, 25),
                new Student("Aman", 92, 21)
        );

        // 1. comparingInt() -> Ascending by marks
        Comparator<Student> byMarksAsc =  Comparator.comparingInt(Student::getMarks);

        // 2. reversed() -> Descending by marks
        Comparator<Student> byMarksDesc = Comparator.comparingInt(Student::getMarks).reversed();

        // 3. thenComparing() -> Marks desc, then name asc
        Comparator<Student> byMarksThenName = Comparator.comparingInt(Student::getMarks).reversed().thenComparing(Student::getName);

        // 4. comparing() -> Sort by name
        Comparator<Student> byName =
                Comparator.comparing(Student::getName);

        // 5. comparingInt() + thenComparingInt()
        Comparator<Student> byMarksThenAge = Comparator.comparingInt(Student::getMarks).thenComparingInt(Student::getAge);

        // 6. reverseOrder()
        Comparator<Integer> reverseNumbers = Comparator.reverseOrder();

        // 7. naturalOrder()
        Comparator<Integer> naturalNumbers = Comparator.naturalOrder();

        // 8. Custom compare() logic
        Comparator<Student> customComparator = (a, b) -> {
            // Higher marks first
            if(a.getMarks() > b.getMarks()) {
                return -1;
            }
            if(a.getMarks() < b.getMarks()) {
                return 1;
            }
            // If marks same, smaller age first
            return a.getAge() - b.getAge();
        };

        //students.sort((a,b)->{
        //    if(a.getMarks()>b.getMarks()){
        //        return -1;
        //    }else if(a.getMarks()<b.getMarks()){
        //        return 1;
        //    }else{
        //        return a.getName().compareTo(b.getName());
        //    }
        //});


        students.sort(byMarksThenName);
        System.out.println(students);
    }
}
