import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CustomObjectsComparator {
    public static void main(String[] args){
        List<Student> students = Arrays.asList(
                new Student("Kapil", 85),
                new Student("Rahul", 78),
                new Student("Ravi", 92)
        );

       //Comparator<Student> comparator = Comparator.comparing(Student::getMarks).reversed();
        Comparator<Student> comparator = Comparator.comparing(Student::getMarks).reversed().thenComparing(Student::getName);

        students.sort(comparator);

//        students.sort((a,b)->{
//            if(a.getMarks()>b.getMarks()){
//                return -1;
//            }else if(a.getMarks()<b.getMarks()){
//                return 1;
//            }else{
//                return a.getName().compareTo(b.getName());
//            }
//        });

        System.out.println(students);
    }


}
