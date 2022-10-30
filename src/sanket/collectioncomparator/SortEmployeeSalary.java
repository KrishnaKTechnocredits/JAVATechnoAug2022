package sanket.collectioncomparator;

import java.util.Comparator;

public class SortEmployeeSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpSalary() - o2.getEmpSalary();
	}
}
