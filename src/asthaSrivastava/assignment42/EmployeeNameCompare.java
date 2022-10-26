package asthaSrivastava.assignment42;

import java.util.Comparator;

public class EmployeeNameCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}
}
