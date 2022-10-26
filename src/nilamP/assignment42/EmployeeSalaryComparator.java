package nilamP.assignment42;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.getEmpSalary() - e2.getEmpSalary();
	}
}
