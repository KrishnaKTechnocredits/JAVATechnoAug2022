package sanket.collectioncomparator;

import java.util.Comparator;

public class SortEmployeeID implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpId().compareTo(o2.getEmpId());
	}
}
