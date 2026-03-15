package Collectors;

import java.util.*;
import java.util.stream.*;

class Employee1 {

    int id;
    String name;
    String department;
    int salary;
    List<String> skills;

    Employee1(int id, String name, String department, int salary, List<String> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.skills = skills;
    }

    public String toString() {
        return name + "(" + salary + ")";
    }
}

public class StreamCollectorsMaster {

    public static void main(String[] args) {

        List<Employee1> employees = List.of(
                new Employee1(1,"Kapil","IT",70000,List.of("Java","Spring")),
                new Employee1(2,"Rahul","IT",60000,List.of("Java","Docker")),
                new Employee1(3,"Aman","HR",50000,List.of("Excel")),
                new Employee1(4,"Neha","Finance",80000,List.of("Accounting","Excel")),
                new Employee1(5,"Ravi","IT",90000,List.of("Java","Kubernetes"))
        );

        // 1 Filter employees with salary > 60000
        List<Employee1> highSalary =
                employees.stream()
                        .filter(e -> e.salary > 60000)
                        .collect(Collectors.toList());

        System.out.println("High Salary: " + highSalary);


        // 2 Map → get employee names
        List<String> names =
                employees.stream()
                        .map(e -> e.name)
                        .collect(Collectors.toList());

        System.out.println("Names: " + names);


        // 3 FlatMap → get all skills
        List<String> skills =
                employees.stream()
                        .flatMap(e -> e.skills.stream())
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println("Skills: " + skills);


        // 4 Group employees by department
        Map<String,List<Employee1>> byDept =
                employees.stream()
                        .collect(Collectors.groupingBy(e -> e.department));

        System.out.println("Group By Dept: " + byDept);


        // 5 Count employees per department
        Map<String,Long> deptCount =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                e -> e.department,
                                Collectors.counting()
                        ));

        System.out.println("Dept Count: " + deptCount);


        // 6 Get employee names per department
        Map<String,List<String>> deptNames =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                e -> e.department,
                                Collectors.mapping(e -> e.name, Collectors.toList())
                        ));

        System.out.println("Dept Names: " + deptNames);


        // 7 Partition employees by salary > 65000
        Map<Boolean,List<Employee1>> partition =
                employees.stream()
                        .collect(Collectors.partitioningBy(e -> e.salary > 65000));

        System.out.println("Partition: " + partition);


        // 8 Total salary
        int totalSalary =
                employees.stream()
                        .collect(Collectors.summingInt(e -> e.salary));

        System.out.println("Total Salary: " + totalSalary);


        // 9 Average salary
        double avgSalary =
                employees.stream()
                        .collect(Collectors.averagingInt(e -> e.salary));

        System.out.println("Average Salary: " + avgSalary);


        // 10 Salary statistics
        IntSummaryStatistics stats =
                employees.stream()
                        .collect(Collectors.summarizingInt(e -> e.salary));

        System.out.println("Statistics: " + stats);


        // 11 Reduce → total salary
        int reduceSalary =
                employees.stream()
                        .map(e -> e.salary)
                        .reduce(0, Integer::sum);

        System.out.println("Reduce Salary: " + reduceSalary);


        // 12 Join all employee names
        String joinedNames =
                employees.stream()
                        .map(e -> e.name)
                        .collect(Collectors.joining(", "));

        System.out.println("Joined Names: " + joinedNames);


        // 13 Convert to Map (id → name)
        Map<Integer,String> idNameMap =
                employees.stream()
                        .collect(Collectors.toMap(
                                e -> e.id,
                                e -> e.name
                        ));

        System.out.println("ID Name Map: " + idNameMap);


        // 14 Top 3 highest salaries
        List<Employee1> top3 =
                employees.stream()
                        .sorted((a,b) -> b.salary - a.salary)
                        .limit(3)
                        .collect(Collectors.toList());

        System.out.println("Top 3: " + top3);


        // 15 Skip first 2 employees
        List<Employee1> skip2 =
                employees.stream()
                        .skip(2)
                        .collect(Collectors.toList());

        System.out.println("Skip 2: " + skip2);
    }
}