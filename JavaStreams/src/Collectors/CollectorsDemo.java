package Collectors;
import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    String department;
    int salary;

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return name + "(" + salary + ")";
    }
}

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Kapil", "IT", 70000),
                new Employee(2, "Rahul", "IT", 60000),
                new Employee(3, "Aman", "HR", 50000),
                new Employee(4, "Ravi", "HR", 55000),
                new Employee(5, "Neha", "Finance", 80000)
        );

        // 1. toList
        List<String> names =
                employees.stream()
                        .map(e -> e.name)
                        .collect(Collectors.toList());
        System.out.println("toList: " + names);

        // 2. toSet
        Set<String> departments =
                employees.stream()
                        .map(e -> e.department)
                        .collect(Collectors.toSet());
        System.out.println("toSet: " + departments);

        // 3. toCollection
        LinkedList<String> linkedList =
                employees.stream()
                        .map(e -> e.name)
                        .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("toCollection: " + linkedList);

        // 4. toMap
        Map<Integer, String> idNameMap =
                employees.stream()
                        .collect(Collectors.toMap(e -> e.id, e -> e.name));
        System.out.println("toMap: " + idNameMap);

        // 5. groupingBy
        Map<String, List<Employee>> groupByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(e -> e.department));
        System.out.println("groupingBy: " + groupByDept);

        // 6. partitioningBy
        Map<Boolean, List<Employee>> highSalary =
                employees.stream()
                        .collect(Collectors.partitioningBy(e -> e.salary > 60000));
        System.out.println("partitioningBy: " + highSalary);

        // 7. counting
        Long count =
                employees.stream()
                        .collect(Collectors.counting());
        System.out.println("counting: " + count);

        // 8. joining
        String joinedNames =
                employees.stream()
                        .map(e -> e.name)
                        .collect(Collectors.joining(", "));
        System.out.println("joining: " + joinedNames);

        // 9. mapping
        Map<String, List<String>> deptNames =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                e -> e.department,
                                Collectors.mapping(e -> e.name, Collectors.toList())
                        ));
        System.out.println("mapping: " + deptNames);

        // 10. reducing
        int totalSalary =
                employees.stream()
                        .collect(Collectors.reducing(
                                0,
                                e -> e.salary,
                                Integer::sum
                        ));
        System.out.println("reducing (total salary): " + totalSalary);

        // 11. summingInt
        int sumSalary =
                employees.stream()
                        .collect(Collectors.summingInt(e -> e.salary));
        System.out.println("summingInt: " + sumSalary);

        // 12. averagingInt
        double avgSalary =
                employees.stream()
                        .collect(Collectors.averagingInt(e -> e.salary));
        System.out.println("averagingInt: " + avgSalary);

        // 13. summarizingInt
        IntSummaryStatistics stats =
                employees.stream()
                        .collect(Collectors.summarizingInt(e -> e.salary));
        System.out.println("summarizingInt: " + stats);

        // 14. collectingAndThen
        List<String> unmodifiableList =
                employees.stream()
                        .map(e -> e.name)
                        .collect(Collectors.collectingAndThen(
                                Collectors.toList(),
                                Collections::unmodifiableList
                        ));
        System.out.println("collectingAndThen: " + unmodifiableList);

        // 15. filtering (Java 9+)
        Map<String, List<Employee>> filtered =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                e -> e.department,
                                Collectors.filtering(
                                        e -> e.salary > 60000,
                                        Collectors.toList()
                                )
                        ));
        System.out.println("filtering: " + filtered);
    }
}