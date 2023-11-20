package consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String employeeName;
	Float salary;

	public Employee(String employeeName, Float salary) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
	}
}

public class consumerExample2 {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Kapil", 75000f));
		employees.add(new Employee("Rahul", 15000f));
		employees.add(new Employee("Kartik", 145000f));
		employees.add(new Employee("Virat", 14542000f));
		employees.add(new Employee("Rohit", 75000656f));

		Function<Employee, Float> fn = e -> {
			Float salary = e.salary;

			if (salary > 10000 && salary <= 1000000) {
				return (salary * 0.1f);
			} else if (salary > 100000 && salary < 200000) {
				return (salary * 0.2f);
			} else
				return (salary * 0.3f);
		};

		Predicate<Float> p = bn -> bn > 50000;

		Consumer<Employee> c = e -> System.out
				.println("Employee Name is : " + e.employeeName + " and his Salary is : " + e.salary);

		for (Employee emp : employees) {
			float bonus = fn.apply(emp);
			if (p.test(bonus)) {
				c.accept(emp);
				System.out.println("Bonus is" + bonus);
			}

		}

	}

}
