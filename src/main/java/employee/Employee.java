package employee;

import java.util.Comparator;

public class Employee {
	private final String id;
	private final String name;
	private final Integer salary;

	public Employee(final String id, final String name, final Integer salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

//	public String getId() {
//		return id;
//	}
//
	public String getName() {
		return name;
	}

	public Integer getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	final static Comparator<Employee> SALARY_CMP = (Employee e1, Employee e2) -> e1.getSalary()
			.compareTo(e2.getSalary());

	final static Comparator<Employee> SALARY_CMPD = (Employee e1, Employee e2) -> e2.getSalary()
			.compareTo(e1.getSalary());

	final static Comparator<Employee> NAME_CMP = (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());

}
