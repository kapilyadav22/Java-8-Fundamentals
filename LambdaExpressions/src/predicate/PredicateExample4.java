package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;


class Employee{
	String employeeName;
	Float salary;
	int experience;

	public Employee(String employeeName, Float salary, int experience) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
		this.experience = experience;
	}
}

public class PredicateExample4 {

	public static void main(String[] args) {

		//create lambda expression for objects
		Predicate<Employee> p = e->(e.salary>50000 && e.experience>3);

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Kapil", 75000f, 0));
		employees.add(new Employee("Rahul", 15000f, 5));
		employees.add(new Employee("Kartik", 145000f, 4));
		employees.add(new Employee("Virat", 14542000f, 15));
		employees.add(new Employee("Rohit", 75000656f, 16));
		employees.add(new Employee("KL Rahul", 75045600f, 4));

		for(Employee employee: employees) {
			if(p.test(employee)) {
				System.out.println(employee.employeeName+"       "+ employee.salary);
			}

		}
//		Employee emp = new Employee("Kapil", 75000f, 0);
//		Employee emp1 = new Employee("Rahul", 15000f, 5);
//		Employee emp2 = new Employee("Rahul", 15000f, 5);
//		Employee emp3 = new Employee("Kartik", 145000f, 4);
//		Employee emp4 = new Employee("VIrat", 14542000f, 15);
//
//		System.out.println(p.test(emp));  //false
//		System.out.println(p.test(emp1)); //false
//		System.out.println(p.test(emp2)); //false
//		System.out.println(p.test(emp3)); //true
//		System.out.println(p.test(emp4)); //true
	}
}
