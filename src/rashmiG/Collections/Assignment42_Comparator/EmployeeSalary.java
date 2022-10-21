package rashmiG.Collections.Assignment42_Comparator;

import java.util.Comparator;

public class EmployeeSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.empSalary - o2.empSalary);
	}
}
