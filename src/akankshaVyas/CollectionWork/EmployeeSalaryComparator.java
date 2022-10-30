package akankshaVyas.CollectionWork;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return o1.getEmpSalary() - o2.getEmpSalary();
	}
}
