package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("1", "asd", 12000));
		employees.add(new Employee("2", "cfgasd", 16000));
		employees.add(new Employee("3", "bnasd", 10000));

		Collections.sort(employees, (e1, e2) -> e1.getSalary() - e2.getSalary());
		Collections.sort(employees, Employee.SALARY_CMP);
		System.out.println(employees);

		Collections.sort(employees, Employee.SALARY_CMPD);
		System.out.println(employees);

		Collections.sort(employees, Employee.NAME_CMP);
		System.out.println(employees);

		List<Employee> filteredEmployeeBasisOfSalary = employees.stream().filter(e -> e.getSalary() > 10000)
				.collect(Collectors.toList());
		System.out.println("filtered Employees Basis Of Salary : " + filteredEmployeeBasisOfSalary);

		System.out.println("max Salay of employee : " + Collections.max(employees, Employee.SALARY_CMP));
		
		IntSummaryStatistics stats= employees.stream().mapToInt(e->e.getSalary()).summaryStatistics();
		
		System.out.println("Average salary of employee : "+ stats.getAverage());
		
		System.out.println("Sum of salaries : " + stats.getSum());
	}

}
