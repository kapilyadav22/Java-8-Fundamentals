package mapStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int empId;
	String employeeName;
	Float salary;

	public Employee(int empId, String employeeName, Float salary) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
}

public class MapExample4 {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		List<Employee> filteredEmployees = new ArrayList<Employee>();

		employees.add(new Employee(1, "Kapil", 75000f));
		employees.add(new Employee(2, "Rahul", 15000f));
		employees.add(new Employee(3, "Kartik", 145000f));
		employees.add(new Employee(4, "Virat", 1454200f));
		employees.add(new Employee(5, "Rohit", 75000656f));

		// combine filter and map
		filteredEmployees = employees.stream().filter(e -> e.salary > 75000).map(s -> {
			s.salary = s.salary * 1.10f;
			return s;
		}).collect(Collectors.toList());
		
	}
}
